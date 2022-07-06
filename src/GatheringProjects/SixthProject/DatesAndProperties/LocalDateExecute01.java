package GatheringProjects.SixthProject.DatesAndProperties;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateExecute01 {
    public static void main(String[] args) {
        // Looking forward to improve our dates and properties, we can use using separating ways as LocalDate and LocalTime
        LocalDate date = LocalDate.of(2022, Month.FEBRUARY, 05);
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println("===================================");
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2);
        System.out.println("====================================");
        // We consider that class as an improvement and mix of LocalDate and LocalTime, therefore, we can put in one
        // class these two concepts

        LocalDate dateLocalDate = LocalDate.of(2022, Month.JUNE, 30);
        System.out.println(dateLocalDate);
        LocalTime timeLocalTime = LocalTime.of(12,44,30);
        System.out.println(timeLocalTime);
        // Remember, we can parse String values to different data types
        LocalDateTime createADate = dateLocalDate.atTime(timeLocalTime);
        System.out.println(createADate);
    }
}
