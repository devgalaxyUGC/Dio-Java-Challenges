package GatheringProjects.FourthProject.Arrays.Execute;

import java.util.Random;

/*
    Make a program that'll read 20 random numbers between 0 and 100 and, then store them in an array
    Finally, print them with their sucessor
 */
public class ThirdArraySession {
    public static void main(String[] args) {
        Random random = new Random();
        int[] storageNumb = new int[20];
        int count = 0;

        while (count < 20) {
            storageNumb[count] = random.nextInt(100);
            System.out.print("Your random numbers are:  "+storageNumb[count]+" ");
            count++;
        }
        System.out.println("\nBelow, We have all the sucessors from StorageNumb Array!");
        for(int sucessorNumb : storageNumb){
            System.out.print("The sucessors are: "+(sucessorNumb+1)+" ");
        }
    }
}
