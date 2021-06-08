package Programmers.LVL_1;

public class Programmers_12954 {
    public long[] solution(int x, int n) {

        long[] answer = new long[n];
        long temp = 0;

        for (int i = 0; i < n; i++) {
            temp += x;
            answer[i] = temp;
        }

        return answer;
    }
}
