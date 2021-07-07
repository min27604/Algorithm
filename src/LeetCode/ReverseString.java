package LeetCode;

public class ReverseString {
    public char[] reverseString(char[] s) {
        char temp = ' ';
        int mid = s.length / 2 - 1;
        if (s.length % 2 == 0) {
            mid += 1;
        }

        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }

        return s;
    }

    public static void main(String[] args) {
        char[] ch = new char[]{'a','b','c','d'};
        ReverseString rs = new ReverseString();
        for (char c : rs.reverseString(ch)) {
            System.out.println(c);
        }
    }
}
