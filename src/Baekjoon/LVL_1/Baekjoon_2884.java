package Baekjoon.LVL_1;

import java.util.Scanner;

public class Baekjoon_2884 {
//    알람을 45분 앞서는 시간으로 바꾸는 것이다.
//    현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int minute = input.nextInt();

        if (minute < 45) {
            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
            minute = 60 - (45 - minute);
        } else {
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }
}
