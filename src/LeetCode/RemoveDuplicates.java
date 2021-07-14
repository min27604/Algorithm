package LeetCode;

import java.util.Stack;

// abbaca

public class RemoveDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> str = new Stack<>();
        str.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (!str.isEmpty() && s.charAt(i) == str.peek()) {
                str.pop();
            } else {
                str.push(s.charAt(i));
            }
        }

        StringBuilder answer = new StringBuilder();
        for (Character character : str) {
            answer.append(character.toString());
        }

        return answer.toString();
    }
}
