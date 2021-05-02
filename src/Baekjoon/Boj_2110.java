package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_2110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int houses = sc.nextInt();
        int router = sc.nextInt();
        int[] location = new int[houses];

        for (int i = 0; i < houses; i++) {
            location[i] = sc.nextInt();
        }

        Arrays.sort(location);

        int min = 1;
        int max = location[houses - 1] - location[0];

    }
}
