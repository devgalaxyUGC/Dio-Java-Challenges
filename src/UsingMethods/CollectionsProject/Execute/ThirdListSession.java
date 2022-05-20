package UsingMethods.CollectionsProject.Execute;


import java.util.*;

import static java.util.Locale.US;

public class ThirdListSession {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        List<Double> degreeStorage = new ArrayList<>();
        // double degreeEntrance; Possível definição fora do escopo do loop
        int count = 0;

        while (count < 6) {
            System.out.println("Write down the temperature: ");
            double degreeEntrance = scanner.nextDouble();
            degreeStorage.add(degreeEntrance);
            count++;
        }
        System.out.println("The first six months: "+degreeStorage);

        Iterator<Double> sumTemperature = degreeStorage.iterator();
        double sumVariable = 0;
        double sumAverage;
        while(sumTemperature.hasNext()){
            Double next = sumTemperature.next();
            sumVariable += next;
        }
        sumAverage = sumVariable/degreeStorage.size();
        System.out.println("The average temperature is: "+sumAverage);
        System.out.println("Minor: "+Collections.min(degreeStorage));
        System.out.println("Greatest: "+Collections.max(degreeStorage));

        // Arranjar algum modo de relacionar a temperatura mais alta com a média e com o switch abaixo!!!!
        int monthsCounter = 0;
        switch(monthsCounter){
            case 0:
                System.out.println("A maior temperatura foi no mês de Janeiro");
                break;
            case 1:
                System.out.println("A maior temperatura foi no mês de Fevereiro");
                break;
            case 2:
                System.out.println("A maior temperatura foi no mês de Março");
                break;
            case 3:
                System.out.println("A maior temperatura foi no mês de Abril");
                break;
            case 4:
                System.out.println("A maior temperatura foi no mês de Maio");
                break;
            case 5:
                System.out.println("A maior temperatura foi no mês de Junho");
                break;
        }

        }

    }
}