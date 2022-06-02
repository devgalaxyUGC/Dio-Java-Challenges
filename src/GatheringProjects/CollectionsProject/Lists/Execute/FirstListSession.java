package GatheringProjects.CollectionsProject.Lists.Execute;
import java.util.*;
/*
    Make a program that put notes on a list and, then, print them
 */

public class FirstListSession {
    public static void main(String[] args) {
        /*
        List lista = new ArrayList(); // Usado antes do Java 5
        List<Double> lista1 = new ArrayList<>(); // Usado com a introdução de Generics e forma recomendada
        ArrayList<Double> lista2 = new ArrayList<>();
        List lista3 = new ArrayList<>(Arrays.asList(20.1, 25.4, 23.8));
        List<Double> lista4 = Arrays.asList(20.1, 25.4, 23.8);
         */
        List<Double> lista = new ArrayList<>();
        lista.add(7d);
        lista.add(3.7d);
        lista.add(4d);
        lista.add(8.2d);
        lista.add(1.5d);
        System.out.println("A lista é organizada por: "+lista.toString());
        lista.add(0,8d);
        System.out.println("Com a adição do elemento no Index 0, a lista é organizada por: "+lista.toString());
        lista.set(0, 9d);
        System.out.println("Com a substituição do elemento no Index 0, a lista é organizada por: "+lista.toString());
        System.out.println("Conferindo se o double 8.0 está contido no conjunto: "+lista.contains(8d));
        System.out.println("Número que está no index 0: "+lista.get(0));
        System.out.println("Menor nota da lista: "+ Collections.min(lista)); // Importamos esse método de Collections Class
        System.out.println("Maior nota da lista: "+ Collections.max(lista)); // Importamos esse método de Collections Class
        System.out.println(lista.iterator());
        // Abaixo desenvolvemos a ideia de somar todos os elementos da lista, por ex.
        Iterator<Double> iteratorSoma = lista.iterator();
        double soma = 0d;
        while(iteratorSoma.hasNext()){
                Double next = iteratorSoma.next();
                soma += next;
        }
        System.out.println("Soma dos elementos de lista: "+soma);
        System.out.println("Quantidade de elementos: "+lista.size());
        System.out.println("Remove as notas menores que 5: ");
        Iterator<Double> iteratorRmvLessFive = lista.iterator();

        while(iteratorRmvLessFive.hasNext()){
            Double next = iteratorRmvLessFive.next();
            if(next<7d){iteratorRmvLessFive.remove();}
        }
        System.out.println(lista.toString());
        System.out.println("Podemos remover todos os elementos da lista com o comando lista.clear();");
    }
}
