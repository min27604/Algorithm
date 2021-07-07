package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int currentNumber = nums[0];
        int currentCounter = 0;

        for (int num : nums) {
            if (num == currentNumber) {
                currentCounter++;
            } else {
                map.put(currentNumber, currentCounter);
                currentCounter = 1;
                currentNumber = num;
            }
        }

        map.put(currentNumber, currentCounter);

        return map.entrySet().stream().max((o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1).get().getKey();
    }
}
