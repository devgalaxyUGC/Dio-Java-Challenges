package GatheringProjects.SixthProject.DatesAndProperties;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class InstantExecute01 {
    public static void main(String[] args) {
        // It's similar with Date Class, but it works with nano secs.
        Instant now = Instant.now();
        System.out.println(now); // Nano secs with Z represents ZULU time or UTC standard

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // 1_000_000_000 = 1 sec


        System.out.println("==============================================");
        // Notice that we can pass seconds per nano directly, because it is instant from Instant Class
        System.out.println(Instant.ofEpochSecond(1));
        System.out.println(Instant.ofEpochSecond(1, 999_999_999));
        System.out.println(Instant.ofEpochSecond(1,1_000_000_000));

        // We can too use Duration Class as a complement of Instant and Period for greater periods
        // We usually use duration for seconds and nano then Period for days, years.
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusYears(2);
        Period period1 = Period.between(date1, date2);
        System.out.println(period1);
    }
}
