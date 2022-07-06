package GatheringProjects.SixthProject.DatesAndProperties;

import java.util.Date;
// It's a obsolet class, but it was the main class to provide us with time attributes
public class DateExecute01 {
    public static void main(String[] args) {
        Date date = new Date(); // Using a parameter as long in ms, we can print the exact time
        System.out.println(date.getTime()); // Describe the long number of the current date
    }
}
