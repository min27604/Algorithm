package Baekjoon.LVL_1;

// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Baekjoon_10818 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int[] numList = new int[num];

        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < num; i++) {
            numList[i] = input.nextInt();
            if (numList[i] > max) {max = numList[i];}
            if (numList[i] < min) {min = numList[i];}
        }
        System.out.println(min + " " + max);
    }
}
