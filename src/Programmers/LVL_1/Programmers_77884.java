package Programmers.LVL_1;

public class Programmers_77884 {
    public int solution(int left, int right) {
        int answer = 0;
        int temp;
        for (int i = left; i <= right; i++) {
            temp = findNumberOfDivisors(i);
            if (temp % 2 == 1) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }

    private int findNumberOfDivisors(int number) {
        int divisors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors++;
            }
        }

        return divisors;
    }
}
