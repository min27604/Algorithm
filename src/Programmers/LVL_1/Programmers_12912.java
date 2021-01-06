package Programmers.LVL_1;

public class Programmers_12912 {
    public long solution(int a, int b) {
        long answer = 0;

        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i < b + 1; i++) {
            answer += i;
        }
        return answer;
    }
}
