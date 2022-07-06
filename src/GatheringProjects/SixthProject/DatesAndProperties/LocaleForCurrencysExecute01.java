package GatheringProjects.SixthProject.DatesAndProperties;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleForCurrencysExecute01 {
    public static void main(String[] args) {
        Locale brazilLcl = new Locale("pt");
        Locale usaLcl = new Locale("en");


        // Now, we are using the Currency format to get all the formats of each country
        NumberFormat[] numberFormat = new NumberFormat[5];
        numberFormat[0] = NumberFormat.getCurrencyInstance();
        numberFormat[1] = NumberFormat.getCurrencyInstance(Locale.CHINA);
        numberFormat[2] = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        numberFormat[3] = NumberFormat.getCurrencyInstance(Locale.KOREA);
        numberFormat[4] = NumberFormat.getCurrencyInstance(Locale.US);
        double value = 110.053;

        for (NumberFormat eachNum : numberFormat) {
            System.out.println(eachNum.format(value));
        }
    }
}
