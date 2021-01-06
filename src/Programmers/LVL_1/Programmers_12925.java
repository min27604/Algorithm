package Programmers.LVL_1;

public class Programmers_12925 {
    public static int solution(String s) {
        int answer = 0;
//        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
//            if (s.charAt(0) == '-') {
//                answer *= -1;
//            }
//            s = s.substring(1);
//        }
        answer = Integer.parseInt(s);

        return answer;
    }
    public static void main(String[] args) {
        String s = "+1234";
        System.out.println(solution(s));
    }
}
