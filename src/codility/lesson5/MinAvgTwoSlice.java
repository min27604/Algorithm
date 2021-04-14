package codility.lesson5;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        float minAvg = (A[0] + A[1]) / 2f;
        int answer = 0;
        for (int i = 2; i < A.length; i++) {
            if ((A[i] + A[i - 1]) / 2f < minAvg) {
                minAvg = (A[i] + A[i - 1]) / 2f;
                answer = i - 1;
            }
        }

        return answer;
    }

    public int solution2(int[] A) {
        float minAvg = (A[0] + A[1]) / 2f;
        int answer = 0;
        for (int i = 2; i < A.length; i++) {
            if ((A[i] + A[i - 1] + A[i - 2]) / 3f < minAvg) {
                minAvg = (A[i] + A[i - 1] + A[i - 2]) / 3f;
                answer = i - 2;
            }

            if ((A[i] + A[i - 1]) / 2f < minAvg) {
                minAvg = (A[i] + A[i - 1]) / 2f;
                answer = i - 1;
            }
        }

        return answer;
    }
}
