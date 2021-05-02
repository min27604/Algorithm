package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max = maxValue(candies);

        for (int i : candies) {
            if (i + extraCandies >= max) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }

        return answer;
    }

    public static int maxValue(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
