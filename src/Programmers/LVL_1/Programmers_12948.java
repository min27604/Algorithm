package Programmers.LVL_1;

public class Programmers_12948 {
    public static String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer.append("*");
        }
        answer.append(phone_number.substring(phone_number.length() - 4));
        return answer.toString();
    }
}
