package schoolalarmsystem.services;

import schoolalarmsystem.model.Lesson;
import schoolalarmsystem.model.School;
import schoolalarmsystem.model.SchoolClass;

import java.util.Calendar;
import java.util.List;

public class AlarmSystemService implements Runnable {

    private School school;

    public AlarmSystemService(School school) {
        this.school = school;
    }

    private void printFutureLessons(List<Lesson> lessons, Calendar now){
        System.out.println("Future Lessons:");
        for(Lesson lesson: lessons){
            if(lesson.getStartTime().compareTo(now) > 0){
                System.out.println(lesson);
            }
        }
    }

    @Override
    public void run() {
        System.out.println("Alarm system started");
        int lessonCounter = 5;
        while(lessonCounter > 0){
            Calendar now = Calendar.getInstance();
            now.set(Calendar.MILLISECOND, 0);
            for (SchoolClass schoolClass: school.getClasses()) {
                List<Lesson> lessons = schoolClass.getLessons();
                for(Lesson lesson: lessons){
                    if(now.compareTo(lesson.getStartTime()) >= 0 && !lesson.getAlarmFired()){
                        System.out.println("*********** Alarm System Notification ************");
                        System.out.println("Current Lesson:");
                        System.out.println(lesson);
                        lesson.setAlarmFired(true);
                        lessonCounter--;
                        printFutureLessons(lessons, now);
                        System.out.println("*********** ************************* ************");
                    }
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Alarm system finished");
    }
}
