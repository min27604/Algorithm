package Baekjoon.LVL_2;

// a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다
// 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라.
// 단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.

import java.util.Scanner;

public class BOJ_1775 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int[][] info = new int[15][15];

        for (int i = 0; i < info.length; i++) {
            info[i][1] = 1;
            info[0][i] = i;
        }

        for (int i = 1; i < info.length; i++) {
            for (int j = 2; j < info[i].length; j++) {
                info[i][j] = info[i][j - 1] + info[i - 1][j];
            }
        }

        int testcases = input.nextInt();
        for (int i = 0; i < testcases; i++) { // # of test case
            int fl = input.nextInt();
            int unit = input.nextInt();
            System.out.println(info[fl][unit]);
        }
    }
}
