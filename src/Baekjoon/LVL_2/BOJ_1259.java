package Baekjoon.LVL_2;

//입력은 여러 개의 테스트 케이스로 이루어져 있으며, 각 줄마다 1 이상 99999 이하의 정수가 주어진다. 입력의 마지막 줄에는 0이 주어지며, 이 줄은 문제에 포함되지 않는다.

import java.util.Scanner;

public class BOJ_1259 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            int a = input.nextInt();
            if (a == 0) { break; }

            String b = Integer.toString(a);
            String c = "";
            for (int i = b.length() - 1; i >= 0; i--) {
                c += b.charAt(i);
            }
            if (b.equals(c)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
