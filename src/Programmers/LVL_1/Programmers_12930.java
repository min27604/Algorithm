package Programmers.LVL_1;

public class Programmers_12930 {
    public String solution(String s) {
        String answer = "";

        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == ' ') {
                index = 0;
                answer += c;
                continue;
            }

            if (index % 2 == 0 && s.charAt(i) > 96) {
                c = (char) (s.charAt(i) - 32);
            }
            else if (index % 2 == 1 && s.charAt(i) < 91) {
                c = (char) (s.charAt(i) + 32);
            }
            answer += c;
            index++;

            System.out.println(answer);
        }
        return answer;
    }
}
