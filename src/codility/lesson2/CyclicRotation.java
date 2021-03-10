package codility.lesson2;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int len = A.length;
        int[] answer = new int[len];

        if (K == 0 || K % len == 0) {
            return A;
        }

        int numToRotate = K % len;
        for (int i = 0; i < len; i++) {
            if (i + numToRotate >= len) {
                 answer[i + numToRotate - len] = A[i];
                continue;
            }
            answer[i + numToRotate] = A[i];
        }

        return answer;
    }
}
