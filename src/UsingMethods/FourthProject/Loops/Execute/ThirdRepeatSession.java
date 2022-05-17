package UsingMethods.FourthProject.Loops.Execute;


import java.util.Scanner;

/*
    Make a code that will read 5 numbers and search for the greatest, then, it'll print it with the average value of
    all numbers.
 */
public class ThirdRepeatSession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int auxVariable = 0;
        int greatestValue = 0;
        int averageValue = 0;

        while(auxVariable < 5){
            System.out.println("Digite um número: ");
            num = scanner.nextInt();
            if(num > greatestValue){
                greatestValue = num;
            }
            averageValue += num;
            auxVariable++;
        }
        System.out.println(greatestValue);
        System.out.println(averageValue/5);
    }
}
