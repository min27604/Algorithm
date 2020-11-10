package Baekjoon.LVL_1;

// "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
// 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

import java.util.Scanner;

public class Baekjoon_8958 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = Integer.parseInt(input.next());

        String[] testResults = new String[cases];
        for (int i = 0; i < cases; i++) {
            int counter = 0;
            int score = 0;
            testResults[i] = input.next();
            for (int j = 0; j < testResults[i].length(); j++) {
                if (testResults[i].charAt(j) == 'O') {
                    counter++;
                    score += counter;
                } else {
                    counter = 0;
                }
            }
            System.out.println(score);
            counter = 0;
            score = 0;
        }
    }
}
