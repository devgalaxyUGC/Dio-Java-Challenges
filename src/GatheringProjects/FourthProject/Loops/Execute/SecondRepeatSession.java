package GatheringProjects.FourthProject.Loops.Execute;

import java.util.Scanner;

/*
    Develop a code working with a grade value and, if this value is greater than 10 or less than 1, ask the user
    to put a valid value between 1 and 10.
 */
public class SecondRepeatSession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        System.out.println("Grade value: ");
        grade = scanner.nextInt();

        while(grade < 1 || grade > 10){
            System.out.println("Invalid Value");
            System.out.println("New Grade Value");
            grade = scanner.nextInt();
        }
    }
}
