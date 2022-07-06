package GatheringProjects.SixthProject.DatesAndProperties;

import java.util.Calendar;


// Works better than Date Class and it's an abstract class
public class CalendarExecute01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // it'll work with our date in System
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.getTime());

    }
}
