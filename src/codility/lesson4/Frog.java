package codility.lesson4;

public class Frog {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        boolean[] check = new boolean[X];
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (!check[A[i]]) {
                counter++;
                check[A[i]] = true;
            }

            if (counter == X) {
                return i;
            }
        }

        return -1;
    }

}
