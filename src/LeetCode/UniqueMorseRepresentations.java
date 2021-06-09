package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class UniqueMorseRepresentations {

    static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        List<String> transforemedList = new ArrayList<>();
        int counter = 0;

        for (String word : words) {
            if (!transforemedList.contains(transformMorse(word))) {
                transforemedList.add(transformMorse(word));
                counter++;
            }
        }

        return counter;
    }

    public static String transformMorse(String s) {
        StringBuilder transformed = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            transformed.append(morse[s.charAt(i) - 'a']);
        }

        return transformed.toString();
    }
}
