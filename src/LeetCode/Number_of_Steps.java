package LeetCode;

public class Number_of_Steps {
    public int numberOfSteps(int num) {
        int counter = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                num -= 1;
            } else {
                num /= 2;
            }
            counter++;
        }

        return counter;
    }
}
