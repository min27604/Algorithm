package Baekjoon;

import java.util.Scanner;

public class Boj_18406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int first = Integer.parseInt(input.substring(0, input.length() / 2));
        int second = Integer.parseInt(input.substring(input.length() / 2));

        if (sums(first) == sums(second)) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }

    public static int sums(int num) {
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num /= 10;
        }

        return sum + num;
    }
}
