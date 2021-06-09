package LeetCode;

import java.util.Arrays;

public class CanMakeArithmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (! (diff == arr[i + 1] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}
