package GatheringProjects;

import java.util.Arrays;
import java.util.Locale;

public class AnagramTest {
    public static void main(String[] args) {
        boolean checkVariable;

        checkVariable = checkAnagram("AMAPA", "MPAAE");
        System.out.println(checkVariable);
    }

    public static boolean checkAnagram(String word1, String word2) {
        word1.toUpperCase();
        word2.toUpperCase();
        if (word1.length() == word2.length()) {
            char[] charWord1Array = word1.toCharArray();
            char[] charWord2Array = word2.toCharArray();
            Arrays.sort(charWord1Array);
            Arrays.sort(charWord2Array);
            return Arrays.equals(charWord1Array, charWord2Array);
        }
        return false;
    }
}


