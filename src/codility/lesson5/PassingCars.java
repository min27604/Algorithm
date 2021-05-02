package codility.lesson5;

public class PassingCars {
    public int solution(int[] A) {
        int zeroCounter = 0;
        int counter = 0;

        for (int j : A) {
            if (j == 0) {
                zeroCounter++;
            } else {
                counter += zeroCounter;
            }
        }

        if (counter > 1000000000) {
            return -1;
        }

        return counter;
    }
}
