package UsingMethods.FourthProject.Loops.Execute;

import java.util.Scanner;

/*
    Make a code working with 2 attributes in Scanner and it must repeat the Scanner until name is equal to 0, then,
    stop it.
 */
public class FirstRepeatSession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name;
        int age;

        while (true){
            System.out.println("Your name: ");
            Name = scanner.next();
            if(Name.equals("0")){
                return;
            }
            System.out.println("Your age: ");
            age = scanner.nextInt();
        }
    }
}
