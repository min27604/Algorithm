package LeetCode;

// Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

public class Reverse_integer {
    public static int reverse(int x) {
        long reversed = 0;
        int sign = 1;

        if (x < 0) { // if x is negative, save that info in sign
            sign *= -1;
            x *= -1;
        }

        while (x > 0) {
            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }

        if (sign == -1) {
            reversed *= sign;
        }

        if ((reversed > Math.pow(-2, 31)) && (reversed < (Math.pow(2, 31) - 1))) {
            return (int) reversed;
        }

        return 0;
    }
}