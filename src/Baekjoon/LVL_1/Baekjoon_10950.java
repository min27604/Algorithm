package Baekjoon.LVL_1;

import java.util.Scanner;

public class Baekjoon_10950 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            String[] temp = input.nextLine().split(" ");
            System.out.println(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]));
        }
    }
}
