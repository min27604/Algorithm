package Baekjoon.LVL_2;

// 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다
// 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

import java.util.Scanner;

public class BOJ_2231 {

    public static int sumIs(int a) {
        int sum = a;
        while (a > 0) {
            sum += (a % 10);
            a = (int) Math.floor(a * 0.1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int result = 0;
        for (int i = 1; i < a; i++) {
            if (sumIs(i) == a) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
