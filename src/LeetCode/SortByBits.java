package LeetCode;

import java.util.Arrays;

public class SortByBits {
    public int[] sortByBits(int[] arr) {
        int length = arr.length;
        Integer[] array = new Integer[length];
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = arr[i];
        }

        Arrays.sort(array, (a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b));
        for (int i = 0; i < length; i++) {
            answer[i] = array[i];
        }

        return answer;
    }
}
