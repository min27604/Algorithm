package Programmers.LVL_1;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_12917 {
    public static String solution(String s) {
        ArrayList<Character> lower = new ArrayList<>();
        ArrayList<Character> upper = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                upper.add(s.charAt(i));
            }
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                lower.add(s.charAt(i));
            }
        }
        Collections.sort(lower);
        Collections.reverse(lower);
        Collections.sort(upper);
        Collections.reverse(upper);

        String answer = "";
        for (int i = 0; i < lower.size(); i++) {
            answer += lower.get(i);
        }
        for (int i = 0; i < upper.size(); i++) {
            answer += upper.get(i);
        }
        return answer;

    }

    public static void main(String[] args) {
        String str = "Zbcdefg";
        System.out.println(solution(str));
    }
}
