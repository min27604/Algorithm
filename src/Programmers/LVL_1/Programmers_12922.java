package Programmers.LVL_1;

public class Programmers_12922 {
    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < (n / 2) + 1; i++) {
            answer.append("수박");
        }
        if (n % 2 == 1) {
            answer.append("수");
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        int a = 3;
        System.out.println(solution(a));
    }
}
