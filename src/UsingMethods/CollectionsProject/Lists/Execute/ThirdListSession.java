package UsingMethods.CollectionsProject.Lists.Execute;


import java.util.*;

public class ThirdListSession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        List<Double> degreeStorage = new ArrayList<>();
        // double degreeEntrance; Possível definição fora do escopo do loop
        int count = 0;

        while (count < 6) {
            System.out.println("Write down the average temperature: ");
            double degreeEntrance = scanner.nextDouble();
            degreeStorage.add(degreeEntrance);
            count++;
        }
        System.out.println("The first six months: " + degreeStorage);

        Iterator<Double> sumTemperature = degreeStorage.iterator();

        double sumVariable = 0;
        Double sumAverage;
        while (sumTemperature.hasNext()) {
            Double next = sumTemperature.next();
            sumVariable += next;
        }
        sumAverage = sumVariable / degreeStorage.size();
        System.out.println("The average temperature is: " + sumAverage);
        System.out.println("Minor: " + Collections.min(degreeStorage));
        System.out.println("Greatest: " + Collections.max(degreeStorage));

        // Arranjar algum modo de relacionar a temperatura mais alta com a média e com o switch abaixo!!!!
        Iterator<Double> eachTemperatureIterator = degreeStorage.iterator();

        int countSwitch = 0;
        while (eachTemperatureIterator.hasNext()) {
            Double temperature = eachTemperatureIterator.next();
            if (temperature > sumAverage) {
                switch (countSwitch) {
                    case 0:
                        System.out.println("January had the temperature greatest than the average!");
                        break;
                    case 1:
                        System.out.println("February had the temperature greatest than the average!");
                        break;
                    case 2:
                        System.out.println("March had the temperature greatest than the average!");
                        break;
                    case 3:
                        System.out.println("April had the temperature greatest than the average!");
                        break;
                    case 4:
                        System.out.println("May had the temperature greatest than the average!");
                        break;
                    case 5:
                        System.out.println("June had the temperature greatest than the average!");
                        break;
                    default:
                        System.out.println("There's no temperature greatest than the average");
                }
            }
        countSwitch++;
        }
    }

}
