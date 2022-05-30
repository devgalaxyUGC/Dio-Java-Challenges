package UsingMethods.CollectionsProject.Map.Execute;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FirstMapSession {
    public static void main(String[] args) {
            /*
            Map lista = new HashMap(); // Antes do Java 5
            Map<String, Integer> lista1 = new HashMap<>(); // Usando Generics
            // Perceba que no caso acima, temos dois parâmetros visto que relacionamos dados entre si
            // nesse caso, uma Key e um Value pelo conceito intrinseco da interface Map
            HashMap<String, String> lista2 = new HashMap<>();
            Map<String, String> lista3 = Map.of("Carro 1", "18.5 km/L", "Carro 2", "15.2 km/L");
            */

        Map<String, Double> carrosPopulares2022 = new HashMap<>(){{
            put("Uno", 15.6);
            put("Mobi", 16.8);
            put("HB20", 15.6);
            put("Kwid", 12.1);
        }};
        // As chaves são únicas, mas os valores podem ser iguais
        System.out.println(carrosPopulares2022);
        carrosPopulares2022.put("Uno", 15.2); // Substitui o valor da chave "Uno"
        System.out.println("Confere se uma key está inserida no conjunto: "+carrosPopulares2022.containsKey("Gol"));
        System.out.println("Retorna o valor atribuido a essa key: "+carrosPopulares2022.get("Uno"));
        System.out.println("O método KeySet() retorna as Keys armazenadas"+carrosPopulares2022.keySet());
        System.out.println("Imprime os valores das keys armazenadas: "+carrosPopulares2022.values());
        System.out.println("Retorna o maior valor de uma chave: "+Collections.max(carrosPopulares2022.values()));
        // Outros métodos de mapeamento são possíveis utilizando Iterators e recursos da classe Collections em geral, como TreeMap, LinkedHashMap e etc
    }
}
