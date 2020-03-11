package schoolalarmsystem.app;

import schoolalarmsystem.model.Lesson;
import schoolalarmsystem.model.School;
import schoolalarmsystem.model.SchoolClass;
import schoolalarmsystem.services.AlarmSystemService;

import java.util.Calendar;

public class SchoolAlarmSystemApp {
    public static void main(String[] args) {
        School school = initSchool("alarmSystemSchool");
        Thread alarmSystemService = new Thread(new AlarmSystemService(school), "alarmSystemService");
        alarmSystemService.start();
    }

    private static School initSchool(String name) {
        School school = new School(name);
        SchoolClass schoolClass = new SchoolClass("Class1");

        int timeBeforeFirstClass = 30;
        int lessonDuration = 30;
        int recessInterval = 15;

        Calendar startTime = moveCalendarForwardByInterval(Calendar.getInstance(), timeBeforeFirstClass);
        Calendar endTime = moveCalendarForwardByInterval(startTime, lessonDuration);

        for(int i=0; i<5; i++){
            Lesson lesson = new Lesson("lesson"+i, "teacher"+i, startTime, endTime);
            startTime = moveCalendarForwardByInterval(endTime, recessInterval);
            endTime = moveCalendarForwardByInterval(startTime, lessonDuration);
            schoolClass.getLessons().add(lesson);
        }
        school.getClasses().add(schoolClass);
        return school;
    }

    public static Calendar moveCalendarForwardByInterval(Calendar calendar, int interval){
        Calendar result = Calendar.getInstance();
        result.set(Calendar.HOUR, calendar.get(Calendar.HOUR));
        result.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE));
        result.set(Calendar.SECOND, calendar.get(Calendar.SECOND));
        result.add(Calendar.SECOND, interval);
        return result;
    }
}
