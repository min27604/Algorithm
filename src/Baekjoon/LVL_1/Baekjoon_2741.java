package Baekjoon.LVL_1;

import java.util.Scanner;

public class Baekjoon_2741 {
    // 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println(i + 1);
        }
    }
}
