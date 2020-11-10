package Baekjoon.LVL_1;

// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
// 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_10809 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        input.close();

        int[] counter = new int[26];
        Arrays.fill(counter, -1);
        for (int i = 0; i < word.length(); i++) {
            if (counter[word.charAt(i) - 'a'] == -1) {
                counter[word.charAt(i) - 'a'] = i;
            }
        }
        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i] + " ");
        }
    }
}
