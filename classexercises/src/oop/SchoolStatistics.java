package oop;

import oop.model.*;

public class SchoolStatistics {
    public static void main(String[] args) {
        School school = generateRandomSchool();
        System.out.println("Task 1: Per school average:");
        System.out.println("**********************");
        System.out.println("School avg: " + getScoolAvg(school));
        System.out.println("**********************\n");

        System.out.println("Task 2: Per classroom average:");
        System.out.println("**********************");
        for(ClassRoom classRoom: school.getClassRooms()){
            System.out.println(classRoom.getName() + " avg: " + getClassRoomAvg(classRoom));
        }
        System.out.println("**********************\n");

        System.out.println("Task 3: Per profession average:");
        System.out.println("**********************");
        String[] schoolProfessions = getSchoolProfessions(school);
        for(String profession: schoolProfessions){
            System.out.println(profession + " avg: " + getProfessionsAvg(profession, school));
        }
        System.out.println("**********************\n");

        System.out.println("Bonus Task 1: Students between 20-30 count and score average");
        System.out.println("**********************");
        printStudentsBetween20to30CountAndScore(school);
        System.out.println("**********************\n");

        System.out.println("Bonus Task 2: Students above 31 count and score average");
        System.out.println("**********************");
        printStudentsAbove31CountAndScore(school);
        System.out.println("**********************\n");

        System.out.println("Bonus Task 3: Students Age avg");
        System.out.println("**********************");
        System.out.println("Students age avg: " + getStudentAgeAvg(school));
        System.out.println("**********************\n");

        System.out.println("Bonus Task 4: Science Teachers (math/physics)");
        System.out.println("**********************");
        System.out.println("Count: " + scienceTeacherCount(school));
        System.out.println("**********************\n");

        System.out.println("Bonus Task 5: Sport and Literature Teacher count");
        System.out.println("**********************");
        System.out.println("Sport Teachers count: " + sportTeacherCount(school));
        System.out.println("Literature Teachers count: " + literatureTeacherCount(school));
        System.out.println("**********************\n");

        System.out.println("Bonus Task 6: Sport team members (sports score above 90)");
        System.out.println("**********************");
        printSportsTeam(school);
        System.out.println("**********************\n");
    }

    // Statistics Methods
    public static double getScoolAvg(School school){
        double sum = 0;
        for(ClassRoom classRoom: school.getClassRooms()){
            sum += getClassRoomAvg(classRoom);
        }
        return sum / school.getClassRooms().length;
    }
    public static double getClassRoomAvg(ClassRoom classRoom){
        double sum = 0;
        for(Student student: classRoom.getStudents()){
            sum += getStudentAvg(student);
        }
        return sum / classRoom.getStudents().length;
    }
    public static double getProfessionsAvg(String profession, School school){
        double professionSum = 0;
        double studentsCounter = 0;
        for(ClassRoom classRoom: school.getClassRooms()){
            for(Student student: classRoom.getStudents()){
                for(Grade grade: student.getGrades()){
                    if(grade.getProfession().equals(profession)){
                        professionSum += grade.getScore();
                        studentsCounter += 1;
                    }
                }
            }
        }
        return professionSum / studentsCounter;
    }
    public static double getStudentAgeAvg(School school){
        double ageSum = 0;
        double studentCount = 0;
        for(ClassRoom classRoom: school.getClassRooms()){
            for(Student student: classRoom.getStudents()){
                ageSum += student.getAge();
                studentCount += 1;
            }
        }
        return ageSum / studentCount;
    }
    public static int scienceTeacherCount(School school){
        int count = 0;
        for(ClassRoom classRoom: school.getClassRooms()){
            String profession = classRoom.getTeacher().getProfession();
            if(profession.equals("math") || profession.equals("physics")){
                count += 1;
            }
        }
        return count;
    }
    public static int sportTeacherCount(School school){
        int count = 0;
        for(ClassRoom classRoom: school.getClassRooms()){
            String profession = classRoom.getTeacher().getProfession();
            if(profession.equals("sports")){
                count += 1;
            }
        }
        return count;
    }
    public static int literatureTeacherCount(School school){
        int count = 0;
        for(ClassRoom classRoom: school.getClassRooms()){
            String profession = classRoom.getTeacher().getProfession();
            if(profession.equals("literature")){
                count += 1;
            }
        }
        return count;
    }
    public static void printStudentsBetween20to30CountAndScore(School school){
        int count = 0;
        double sum = 0;
        for(ClassRoom classRoom: school.getClassRooms()){
            for(Student student: classRoom.getStudents()){
                if(student.getAge()>=20 && student.getAge()<=30){
                    sum += getStudentAvg(student);
                    count += 1;
                }
            }
        }
        System.out.println("Students between 20-30 amount: " + count);
        System.out.println("Students between 20-30 avg: " + (sum / count));
    }
    public static void printStudentsAbove31CountAndScore(School school){
        int count = 0;
        double sum = 0;
        for(ClassRoom classRoom: school.getClassRooms()){
            for(Student student: classRoom.getStudents()){
                if(student.getAge()>31){
                    sum += getStudentAvg(student);
                    count += 1;
                }
            }
        }
        System.out.println("Students above 31 amount: " + count);
        System.out.println("Students above 31 avg: " + (sum / count));
    }
    public static void printSportsTeam(School school){
        for(ClassRoom classRoom: school.getClassRooms()){
            for(Student student: classRoom.getStudents()){
                for(Grade grade: student.getGrades()){
                    if(grade.getProfession().equals("sports") && grade.getScore() > 90){
                        System.out.println("Team member from class "  + student.getName() + " Sports score: " + grade.getScore());
                    }
                }
            }
        }
    }

    // Helper Methods
    public static String[] getSchoolProfessions(School school){
        String[] professions = new String[0];
        for(ClassRoom classRoom: school.getClassRooms()){
            for(Student student: classRoom.getStudents()){
                for(Grade grade: student.getGrades()){
                    String pro = grade.getProfession();
                    boolean proFound = false;
                    for(String profession: professions){
                        if(profession.equals(pro)){
                            proFound = true;;
                        }
                    }
                    if(!proFound){
                        String[] tmpProfessions = new String[professions.length+1];
                        System.arraycopy(professions, 0, tmpProfessions, 0, professions.length);
                        tmpProfessions[professions.length] = pro;
                        professions = tmpProfessions;
                    }

                }
            }
        }
        return professions;
    }
    public static double getStudentAvg(Student student){
        double sum = 0;
        for(Grade grade: student.getGrades()){
            sum += grade.getScore();
        }
        return sum / student.getGrades().length;
    }

    // Random Generation Methods
    public static String getRandomProfession(){
        String[] professions = {"math", "chemistry", "geography", "literature", "physics", "sports"};
        return professions[(int)(Math.random()*6)];
    }
    public static int getRandomInt(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;

    }
    public static Grade generateGrade(){
        return new Grade(getRandomProfession(), getRandomInt(40, 100));
    }
    public static Student generateRandomStudent(String name){
        Student randomStudent = new Student("Student"+name, getRandomInt(20, 120));
        Grade[] grades = new Grade[randomStudent.getGrades().length];

        int index=0;
        while(index<grades.length){
            Grade randomGrade = generateGrade();

            boolean professionAlreadyExists = false;
            for(int j=0; !professionAlreadyExists && j<grades.length; j++){
                if(grades[j] != null && grades[j].getProfession().equals(randomGrade.getProfession())){
                    professionAlreadyExists = true;
                }
            }
            if(!professionAlreadyExists){
                grades[index] = randomGrade;
            } else
                // Making sure the loop runs until the student has all professions assigned
                index--;
            index++;
        }
        randomStudent.setGrades(grades);
        return randomStudent;
    }
    public static Teacher generateRandomTeacher(String name){
        return new Teacher("Teacher"+name, getRandomInt(20, 120), getRandomProfession());
    }
    public static ClassRoom generateRandomClassRoom(String name){
        ClassRoom randomClassRoom = new ClassRoom("ClassRoom"+name, generateRandomTeacher(name));
        Student[] randomStudents = new Student[randomClassRoom.getStudents().length];
        for(int i=0; i<randomStudents.length; i++){
            randomStudents[i] = generateRandomStudent(""+i);
        }
        randomClassRoom.setStudents(randomStudents);
        return randomClassRoom;
    }
    public static School generateRandomSchool(){
        School randomSchool = new School();
        ClassRoom[] randomClassRooms = new ClassRoom[randomSchool.getClassRooms().length];
        int index=0;

        while(index<randomClassRooms.length){
            ClassRoom randomClassRoom = generateRandomClassRoom(""+index);
            boolean classRoomAlreadyExists = false;
            for(int j=0; !classRoomAlreadyExists && j<randomClassRooms.length; j++){
                if(randomClassRooms[j] != null && randomClassRooms[j].getTeacher().getProfession().equals(randomClassRoom.getTeacher().getProfession())){
                    classRoomAlreadyExists = true;
                }
            }
            if(!classRoomAlreadyExists){
                randomClassRooms[index] = randomClassRoom;
            } else
                // Making sure the loop runs until the student has all professions assigned
                index--;
            index++;
        }
        randomSchool.setClassRooms(randomClassRooms);
        return randomSchool;
    }
}
