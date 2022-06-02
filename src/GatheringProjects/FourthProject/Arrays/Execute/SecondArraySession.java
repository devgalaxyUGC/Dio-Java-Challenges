package GatheringProjects.FourthProject.Arrays.Execute;

import java.util.Scanner;

/*
    Make a program that will read an array built by 6 positions
    and then, make it a description of all consonants, finally, print them
 */
public class SecondArraySession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] AllLetters = new String[6];
        String Letters;

        for (int count = 0; count < AllLetters.length; count++) {
            System.out.println("Write down a char: ");
            Letters = scanner.next();
            if (!(Letters.equalsIgnoreCase("a")
                    || Letters.equalsIgnoreCase("e")
                    || Letters.equalsIgnoreCase("i")
                    || Letters.equalsIgnoreCase("o")
                    || Letters.equalsIgnoreCase("u"))){
            AllLetters[count] = Letters;
            }
        }
        for(String Consonants : AllLetters){
            if(Consonants != null)
            System.out.println("Suas consoantes são: "+Consonants);
        }
    }
}
