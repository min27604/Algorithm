package codility.lesson2;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                continue;
            }

            for (int j = i; j < A.length; i++) {
                if (A[j] == A[i]) {
                    A[i] = 0;
                    A[j] = 0;
                }
            }
        }

        for (int i : A) {
            if (i != 0) {
                return i;
            }
        }
        return 0;
    }
}
