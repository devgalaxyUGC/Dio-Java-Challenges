package GatheringProjects.FifthProject.Execute;

import java.util.Scanner;

public class ThrowCases {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        checkAge(age);
    }

    public static int checkAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("You wrote an invalid value, please again!");
        }
        System.out.println(age);
        return age;
    }
}
