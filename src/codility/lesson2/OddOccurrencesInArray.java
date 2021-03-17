package codility.lesson2;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                continue;
            }

            for (int j = 0; j < A.length; j++) {
                if (j == i) {
                    continue;
                }
                if (A[j] == A[i]) {
                    A[j] = 0;
                    A[i] = 0;
                    break;
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

    public static int solution2(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length; i += 2) {
            if (i == A.length - 1) {
                return A[i];
            }

            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution2(arr));
    }
}
