package Baekjoon.LVL_2;

// 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

import java.util.Scanner;

public class BOJ_2292 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();

        System.out.println((a - 1) / 6 + 2);
    }
}
