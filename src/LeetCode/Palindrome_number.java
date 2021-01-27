package LeetCode;

//Given an integer x, return true if x is palindrome integer.
//
//An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

public class Palindrome_number {
    public static boolean isPalindrome(int x) {
        String temp = "";
        String xAsString =  Integer.toString(x);
        for (int i = (xAsString.length() - 1); i >= 0; i--) {
            temp += xAsString.charAt(i);
        }

        if (temp.equals(xAsString)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) { return false; }
        int reversed = 0, remainder = x;
        while (remainder != 0) {
            reversed = (reversed * 10) + (remainder % 10);
            remainder /= 10;
        }
        return x == reversed;
    }
}
