package codility.lesson4;

public class PermCheck {
    public int solution(int[] A) {
        boolean[] checker = new boolean[A.length];

        for (int j : A) {
            if (j > A.length) {
                return 0;
            }
            if (checker[j - 1]) {
                return 0;
            }

            checker[j - 1] = true;
        }

        for (boolean check : checker) {
            if (!check) {
                return 0;
            }
        }

        return 1;
    }
}
