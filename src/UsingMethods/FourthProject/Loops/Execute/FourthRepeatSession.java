package UsingMethods.FourthProject.Loops.Execute;

import java.util.Scanner;

/*
    Make a program that'll ask N numbers and, then, prepare a code to calculate the amount of even and odd numbers
 */
public class FourthRepeatSession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int evenNumbers = 0, oddNumbers = 0, totalNumbers = 0;

        while (true) {
            System.out.println("Write down a number: ");
            num = scanner.nextInt();
            if (num % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            totalNumbers++;
            System.out.println("Amount of Even Numbers: "+evenNumbers);
            System.out.println("Amount of Odd Numbers: "+oddNumbers);
            System.out.println("Total Numbers Registered: "+totalNumbers);
        }
    }
}
