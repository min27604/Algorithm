package Baekjoon.LVL_1;

// 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.

import java.util.Scanner;

public class Baekjoon_2920 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] keys = new int[8];

        for (int i = 0; i < keys.length; i++) {
            keys[i] = input.nextInt();
        }

        String itIs = "";
        for (int i = 0; i < keys.length - 1; i++) {
            if (keys[i] + 1 == keys[i + 1]) {
                itIs = "ascending";
            } else if (keys[i] - 1 == keys[i + 1]) {
                itIs = "descending";
            } else {
                itIs = "mixed";
                break;
            }
        }

        System.out.println(itIs);
    }
}
