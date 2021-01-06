package Baekjoon.LVL_2;

// 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
// 이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
// N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2798 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfCards = input.nextInt();
        int blackjack = input.nextInt();
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < numOfCards; i++) {
            cards.add(input.nextInt());
        }

        ArrayList<Integer> sums = new ArrayList<>();

        for (int i = 0; i < numOfCards; i++) {
            for (int j = i + 1; j < numOfCards; j++) {
                for (int k = j + 1; k < numOfCards; k++) {
                    if (cards.get(i) + cards.get(j) + cards.get(k) <= blackjack) {
                        sums.add(cards.get(i) + cards.get(j) + cards.get(k));
                    }
                }
            }
        }
        System.out.println(Collections.max(sums));
    }
}
