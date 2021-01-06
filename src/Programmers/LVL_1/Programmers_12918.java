package Programmers.LVL_1;

public class Programmers_12918 {
    public static boolean solution(String s) {
        boolean answer = false;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                    answer = false;
                    break;
                }
                answer = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "129358";
        boolean a = ('1' < 48) || ('1' > 57);
        System.out.println(a);
        System.out.println(solution(s));
    }
}
