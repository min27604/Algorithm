package codility.lesson3;

import java.util.*;

public class PermMissingElem {
    public static int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5};
        System.out.println(solution(arr));
    }
}
