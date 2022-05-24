package UsingMethods.CollectionsProject.Set.Execute;
import java.util.*;

public class FirstSetSession {
    public static void main(String[] args) {
        /*
        Set notas = new HashSet<>(); //Iniciava assim antes do Java 5
        Set<Double> notas1 = new HashSet<>(); //Inicia com Generics depois do JDK 5
        HashSet<Double> notas3 = new HashSet<>();
        Set<Double> notas4 = new HashSet<>(Arrays.asList(7d, 8.5d, 9.6d, 8d)); //Inicializa com valores pré estabelecidos
        Set<Double> notas5 = Set.of(1.5d, 8.4d, 9.2 ); // Sintaxe diferente da anterior
         */

        Set<Double> notas = new HashSet<>();
        notas.add(8.4d);
        notas.add(9.0d);
        notas.add(6.1d);
        notas.add(9.7d);
        notas.add(8.4d);
        System.out.println("O conjunto criado é definido por: "+notas);
        System.out.println("Perceba que o conjunto não mostra os elementos duplicados e nem em ordem.");
        System.out.println("Perceba que não podemos expressar a relação de uma nota e posição, nem usar métodos de setters and getters");

        System.out.println("Porém, podemos usar métodos de Collections e conferências booleanas como métodos de ( Pertence/Contain ) e valores máximos/mínimos");
        Iterator<Double> notasIterator = notas.iterator();
        Double soma = 0.0;
        while(notasIterator.hasNext()){
            Double next = notasIterator.next();
            soma += next;
        }
        System.out.println("A soma é dada por: "+soma);
        notas.remove(8.4);

        System.out.println("Como dito, não podemos criar esse HashSet e manter a ordem de entrada, como visto em Lists e Arrays anteriormente");
        System.out.println("Porém, usando a LinkedHashSet conseguimos desempenhar essa função");

        LinkedHashSet<Double> notas2 = new LinkedHashSet<>();
        notas2.add(12d);
        notas2.add(5.89d);
        notas2.add(8.6d);
        notas2.add(9.4d);
        System.out.println(notas2);
        System.out.println("Visando colocar em ordem, temos a construção do TreeSet");

        TreeSet<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Excluindo o conjunto 2: ");
        notas2.clear();
        System.out.println(notas2);
        System.out.println(notas3);
    }
}
