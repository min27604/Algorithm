package Baekjoon;

import java.util.Scanner;

public class Boj_1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] counter = new int[2];

        if (str.charAt(0) == '0') {
            counter[0]++;
        } else {
            counter[1]++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '0' && str.charAt(i - 1) != str.charAt(i)) {
                counter[0]++;
            } else if (str.charAt(i) == '1' && str.charAt(i - 1) != str.charAt(i)) {
                counter[1]++;
            }
        }

        System.out.println(Math.min(counter[0], counter[1]));
    }
}
