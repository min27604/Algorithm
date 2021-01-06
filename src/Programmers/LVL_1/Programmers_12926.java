package Programmers.LVL_1;

public class Programmers_12926 {
    public static String solution(String s, int n) {
        char[] letters = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                letters[i] = s.charAt(i);
                continue;
            }
            letters[i] = (char) (s.charAt(i) + n);
            if (letters[i] > 'Z' && s.charAt(i) <= 'Z') {
                letters[i] = (char) (letters[i] - 90 + 64);
            }
            if (letters[i] > 'z' && s.charAt(i) >= 'a') {
                letters[i] = (char) (letters[i] - 122 + 96);
            }
        }
        String answer = String.valueOf(letters);
        return answer;
    }
    public static void main(String[] args) {
        String s = "a B z";
        int n = 20;
        System.out.println(solution(s, n));
    }
}
