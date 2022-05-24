package UsingMethods.CollectionsProject.Set.Execute;

/*
    Make a program that build an rainbow with the description using Set Interface
 */

import java.util.*;

public class ThirdSetSession {
    public static void main(String[] args) {

        Set<String> rainbow = new LinkedHashSet<>(Arrays.asList("Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Pink"));

        System.out.println("All colors included in a rainbow: ");
        for (String eachColor : rainbow) {
            System.out.println(eachColor + " ");
        }
        System.out.println("=========================================");

        System.out.println("A rainbow has " + rainbow.size() + " colors");

        Set<String> rainbowColorOrder = new TreeSet<>(rainbow);
        System.out.println("Following the natural order of the colors, a rainbow is made by: " + rainbowColorOrder);

        System.out.println("=========================================");

        System.out.println("Now, we'll develop a reverse list of all collors in the last Set we built!");
        List<String> reverseCollorOrder = new ArrayList<>(rainbowColorOrder);
        Collections.reverse(reverseCollorOrder);
        System.out.println("Reversed Collor Order is: "+reverseCollorOrder);

        System.out.println("=========================================");
        System.out.print("The colors with the first letter 'p' are: ");
        for(String colorsWithoutP : rainbowColorOrder){
            if(colorsWithoutP.startsWith("P")) System.out.println(colorsWithoutP+" ");
        }
        System.out.println("=====================================");
        System.out.println("Below, we'll remove each color which starts with 'P'");
        Iterator<String> colorsWithP = rainbowColorOrder.iterator();
        while(colorsWithP.hasNext()){
            String next = colorsWithP.next();
            if(next.startsWith("P")){
                colorsWithP.remove();
            }
        }
        System.out.println(rainbowColorOrder);
        System.out.println("=====================================");
        System.out.println("Now, we'll clear the rainbow");
        rainbowColorOrder.clear();
        System.out.println("This is our RainbowColorOrder now: "+rainbowColorOrder);
    }
}
