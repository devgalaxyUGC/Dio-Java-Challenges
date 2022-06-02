package GatheringProjects.FourthProject.Loops.Execute;

import java.util.Scanner;

/*
    Make a program a factorial number with an number entered by the user
 */
public class SixthRepeatSession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEntrance;
        int product = 1;

        System.out.println("Write down your number: ");
        numEntrance = scanner.nextInt();
        // 5.4.3.2.1 = 5!

        for(int i = numEntrance; i >= 1 ;i--){
            System.out.println("Product "+product+" will receive i: "+i);
            product = product * i;
            System.out.println("Product is now "+product+" after multiplied by "+i);
        }
    }
}
