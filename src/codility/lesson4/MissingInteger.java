package codility.lesson4;

import java.util.Arrays;

public class MissingInteger {
    public static int solution(int[] A) {
        int smallest = 1;

        Arrays.sort(A);

        for (int i : A) {
            if (i == smallest) {
                smallest++;
            }
        }

        return smallest;

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, -3}));
    }
}
