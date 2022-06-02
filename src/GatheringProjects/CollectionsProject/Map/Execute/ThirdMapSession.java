package GatheringProjects.CollectionsProject.Map.Execute;

/*
    Build a dictionary that establish the relationship every state with population
 */

import java.util.*;

public class ThirdMapSession {
    public static void main(String[] args) {
        Map<String, Integer> brazilianStates = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 33251543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for(Map.Entry<String, Integer> eachState : brazilianStates.entrySet()){
            System.out.println("State: "+eachState.getKey()+"\nQuantity: "+eachState.getValue()+"\n=============");
        }
        System.out.println("\tCheck Catalog Below\t");
        brazilianStates.put("RN", 544165);
        for(Map.Entry<String, Integer> eachState : brazilianStates.entrySet()){
            System.out.println("State: "+eachState.getKey()+"\nQuantity: "+eachState.getValue()+"\n=============");
        }
        System.out.println("O estado da Paraíba está catalogada? "+brazilianStates.containsKey("PB"));
        brazilianStates.put("PB", 4039277);
        System.out.println("A população de Pernambuco (PE) é: "+brazilianStates.get("PE"));
        System.out.println(" "+"\n ");



        Map<String, Integer> brazilianStatesInOrd = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 33251543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for(Map.Entry<String, Integer> eachState : brazilianStatesInOrd.entrySet()){
            System.out.println("State: "+eachState.getKey()+"\nQuantity: "+eachState.getValue()+"\n=============");
        }
        System.out.println(" "+"\n ");
        System.out.println(" "+"\n ");
        System.out.println("\tNames Following Order\t");
        Set<Map.Entry<String, Integer>> brazilianStatesNameOrd = brazilianStates.entrySet();
        for(Map.Entry<String, Integer> eachState : brazilianStatesNameOrd){
            System.out.println("State: "+eachState.getKey()+"\nQuantity: "+eachState.getValue()+"\n=============");
        }

        System.out.println("The state with minor quantity is: "+Collections.min(brazilianStates.values()));
        System.out.println("The state with max quantity is: "+Collections.max(brazilianStates.values()));
    }
}
