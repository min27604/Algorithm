package Baekjoon.LVL_2;

// 한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다.
// 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class BOJ_1085 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), y = input.nextInt(), w = input.nextInt(), h = input.nextInt();
        input.close();

        int distanceX = Integer.min(x, (w - x));
        int distanceY = Integer.min(y, (h - y));

        System.out.println(Integer.min(distanceX, distanceY));
    }
}
