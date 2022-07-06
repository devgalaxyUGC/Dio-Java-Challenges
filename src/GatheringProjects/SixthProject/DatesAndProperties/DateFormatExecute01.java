package GatheringProjects.SixthProject.DatesAndProperties;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatExecute01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7]; // DateFormat is an abstract class, but, we're using as an Array
        // Therefore, we need to declare using new, remembering, it's different in cases as we don't work with arrays
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[4] = DateFormat.getDateInstance(DateFormat.LONG);
        df[5] = DateFormat.getDateInstance(DateFormat.FULL);
        df[6] = DateFormat.getDateInstance(DateFormat.DATE_FIELD);

        for(DateFormat eachDate : df){
            System.out.println(eachDate.format(calendar.getTime()));
        }
    }
}
