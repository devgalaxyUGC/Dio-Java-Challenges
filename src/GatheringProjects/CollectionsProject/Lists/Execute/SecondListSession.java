package GatheringProjects.CollectionsProject.Lists.Execute;

import GatheringProjects.CollectionsProject.Lists.Domain.SecondListSessionDomain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Make a list about cats and organize all the attributes
    in a way that prints ( name - age - color )
 */
public class SecondListSession {
    public static void main(String[] args) {
        List<SecondListSessionDomain> cats = new ArrayList<>() {{
            add(new SecondListSessionDomain("Cielly", 9, "Cinza"));
            add(new SecondListSessionDomain("Jon", 18, "Preto"));
            add(new SecondListSessionDomain("Simba", 6, "Tigrado"));
            add(new SecondListSessionDomain("Jon", 12, "Amarelo"));
        }};
        System.out.println(cats.toString());
        System.out.println("================================================================");
        cats.add(new SecondListSessionDomain("Pretinha", 4, "Preto"));
        System.out.println(cats.toString()); // Insertion
        System.out.println("================================================================");
        Collections.shuffle(cats); // Método que randomiza a lista a partir de Collections
        System.out.println(cats.toString());
        Collections.sort(cats);
        System.out.println(cats.toString());
    }
}