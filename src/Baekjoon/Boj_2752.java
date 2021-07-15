package Baekjoon;

import java.util.Scanner;

public class Boj_2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < 3; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            int min = 1_000_000_000;
            int index = i;

            for (int j = i; j < 3; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }

            array[index] = array[i];
            array[i] = min;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
