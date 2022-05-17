package UsingMethods.FourthProject.Loops.Execute;
import java.util.Scanner;
/*
    Make a "TABUADA" generator capable of calculate all
    products from an entrance between 1 and 10
 */
public class FifthRepeatSession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEntrance;

        System.out.println("Write down your number: ");
        numEntrance = scanner.nextInt();

        for(int i = 1; i < 11 ; i++){
          int productNumber;
          productNumber = numEntrance * i;
          System.out.println(numEntrance+" X "+i+" = "+productNumber);
        }
    }
}
