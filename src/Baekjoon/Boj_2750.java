package Baekjoon;

import java.util.Scanner;

public class Boj_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        int[] answer = selection(array);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    private static int[] bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    } // 이거 대체 왜 틀린거

    private static int[] selection(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int min = 1001;
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }

            array[index] = array[i];
            array[i] = min;
        }

        return array;
    }
}

