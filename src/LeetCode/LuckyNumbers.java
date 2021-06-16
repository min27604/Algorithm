package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Set<Integer> minimum = new HashSet<>();
        List<Integer> maximum = new ArrayList<>();

        for (int[] ints : matrix) {
            int min = ints[0];
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, ints[j]);
            }
            minimum.add(min);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for (int[] ints : matrix) {
                max = Math.max(ints[i], max);
            }
            if (minimum.contains(max)) {
                maximum.add(max);
            }
        }

        return maximum;
    }
}
