package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Decompress_Run_Lengt_Encoded_List {
    public int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++) {
            int freq = nums[2 * i];
            while (freq > 0) {
                list.add(nums[2 * i + 1]);
                freq--;
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
