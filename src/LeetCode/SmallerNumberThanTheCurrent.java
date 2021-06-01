package LeetCode;

public class SmallerNumberThanTheCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (j < i) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
