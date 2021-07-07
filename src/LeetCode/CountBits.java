package LeetCode;

public class CountBits {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.bitCount(i);
        }

        return answer;
    }

    private static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public int[] countBits2(int n) {
        int[] answer = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            answer[i] = Integer.bitCount(i);
        }

        return answer;
    }
}
