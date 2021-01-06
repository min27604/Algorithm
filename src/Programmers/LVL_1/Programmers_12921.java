package Programmers.LVL_1;

public class Programmers_12921 {
    public static int solution(int n) {
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;
        for (int i = 2; i < n; i++) {
            if (prime[i] == true) {
                continue;
            }
            for (int j = i + i; j < n; j += i) {
                prime[j] = true;
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (prime[i] == false) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.println(solution(a));
    }
}
