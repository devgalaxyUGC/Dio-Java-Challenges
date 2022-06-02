package GatheringProjects.CollectionsProject.DataStructureJava.Execute;

import java.util.Locale;
import java.util.Scanner;

public class TwoDots {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double firstContent = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        double squareRoot = Math.sqrt(firstContent);
        System.out.printf("%.4f%n", squareRoot);
    }
}
