package LeetCode;

public class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        int[] temp = new int[101];

        for (int i : nums) {
            temp[i]++;
        }

        for (int i : temp) {
            answer = i * (i - 1) / 2;
        }

        return answer;
    }
}
