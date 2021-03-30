package codility.lesson3;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        int total = 0;

        for (int j : A) total += j;

        int diff = Integer.MAX_VALUE;
        int prev = 0;
        int next = total;

        for (int p = 1; p < A.length; p++) {
            prev += A[p - 1];
            next = total - prev;
            diff = Math.min(diff, Math.abs(prev - next));
        }

        return diff;
    }
}
