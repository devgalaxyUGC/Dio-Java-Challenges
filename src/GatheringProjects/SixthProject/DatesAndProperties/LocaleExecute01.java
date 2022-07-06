package GatheringProjects.SixthProject.DatesAndProperties;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExecute01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        // We can use Locale too for numbers in our System and code
        System.out.println(Locale.getDefault()); // Our system
       // Locale.setDefault(Locale.US); // Setting a different standard
       // System.out.println(Locale.getDefault()); // New standard

        // Like DateFormat, we can use NumberFormat with the same particularities as an abstract class
        NumberFormat[] numberFormat = new NumberFormat[4];
        numberFormat[0] = NumberFormat.getInstance();
        numberFormat[1] = NumberFormat.getInstance(Locale.CHINA);
        numberFormat[2] = NumberFormat.getInstance(Locale.FRENCH);
        numberFormat[3] = NumberFormat.getInstance(Locale.KOREA);
        double value = 110.053;

        for (NumberFormat eachNum : numberFormat) {
            System.out.println(eachNum.format(value));
        }

    }
}
