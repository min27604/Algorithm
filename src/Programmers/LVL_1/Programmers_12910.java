package Programmers.LVL_1;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_12910 {

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int j : arr) {
            if (j % divisor == 0) {
                nums.add(j);
            }
        }
        Collections.sort(nums);

        int[] answer;
        if (nums.size() == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[nums.size()];
            for (int i = 0; i < nums.size(); i++) {
                answer[i] = nums.get(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 10, 5, 15};
        int divisor = 5;
        int[] ans = solution(arr, divisor);
        for (int an : ans) {
            System.out.println(an);
        }
    }
}
