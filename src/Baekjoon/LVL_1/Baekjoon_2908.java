package Baekjoon.LVL_1;

import java.util.Scanner;

public class Baekjoon_2908 {
//    예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//
//    두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//
//        int newA = ((a % 10) * 100) + (a - ((a / 100) * 100) - (a % 10)) + (a / 100);
//        int newB = ((b % 10) * 100) + (b - ((b / 100) * 100) - (b % 10)) + (b / 100);
//
//        if (newA > newB) {
//            System.out.println(newA);
//        } else {
//            System.out.println(newB);
//        }
//    }

    static int fx(int a) {
        int hundred = a % 10;
        int ten = (int)((a * .1) % 10);
        int one = a / 100;

        return (hundred * 100 + ten * 10 + one);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println((fx(a) > fx(b)) ? fx(a) : fx(b));
    }
}
