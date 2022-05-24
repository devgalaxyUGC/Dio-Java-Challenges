package UsingMethods.CollectionsProject.Lists.Execute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FourthListSession {
    public static void main(String[] args) {
        List<String> answersList = new ArrayList<>(5);
        Scanner scanner = new Scanner(System.in);
        String directAnswer;
        System.out.println("Halt! We believe you're an special person in our case...");
        System.out.println("You'll answer some questions now only using YES or NO...");

        System.out.println("Did you called the victim nearly the day that everything occurred? ");
        directAnswer = scanner.next();
        answersList.add(directAnswer.toUpperCase());

        System.out.println("Were you at the crime vinicities sometime ago? ");
        directAnswer = scanner.next();
        answersList.add(directAnswer.toUpperCase());

        System.out.println("Do you live nearly the place that everything happened? ");
        directAnswer = scanner.next();
        answersList.add(directAnswer.toUpperCase());

        System.out.println("Did you had some kind of financial debt or issue with the victim? ");
        directAnswer = scanner.next();
        answersList.add(directAnswer.toUpperCase());

        System.out.println("Has you worked previously with the victim? ");
        directAnswer = scanner.next();
        answersList.add(directAnswer.toUpperCase());

        System.out.println(answersList.toString()); // All the answer yet
        Iterator<String> checkAnswer = answersList.iterator();

        int guiltyCount = 0;

        while (checkAnswer.hasNext()) {
            String response = checkAnswer.next();
            if (response.equalsIgnoreCase("YES")) {
                guiltyCount++;
            }
        }

        switch (guiltyCount) {
            case 2:
                System.out.println("Suspect");
                break;
            case 3:
            case 4:
                System.out.println("Partner");
                break;
            case 5:
                System.out.println("Convict");
                break;
            default:
                System.out.println("Innocent");
        }

    }
}
