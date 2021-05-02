package LeetCode;

public class Shuffle_the_Array {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];

        answer[0] = nums[0];

        for (int i = 2; i < 2 * n; i += 2) {
            answer[i] = nums[i / 2];
        }
        for (int i = 1; i < 2 * n; i+= 2) {
            answer[i] = nums[i / 2 + n];
        }

        return answer;
    }
}
