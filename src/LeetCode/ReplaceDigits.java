package LeetCode;

public class ReplaceDigits {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                int a = s.charAt(i) - '0';
                sb.append((char) (s.charAt(i - 1) + a));
            } else {
                sb.append(s.charAt(i));
            }
        }
        sb.append(s.charAt(s.length() - 1));

        return sb.toString();
    }

    public static void main(String[] args) {
        char a = '1';
        char b = 'b';
        System.out.println((char) (a - '0' + b));
    }
}
