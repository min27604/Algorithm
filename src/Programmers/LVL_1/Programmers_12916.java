package Programmers.LVL_1;

public class Programmers_12916 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int p = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') { p++; }
            if (s.charAt(i) == 'y') { y++; }
        }
        return (p == y);
    }
}
