package LeetCode;

public class HalvesAreAlike {
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int half = s.length() / 2;
        String a = s.substring(0, half);
        String b = s.substring(half);

        return vowelCounter(a) == vowelCounter(b);
    }

    public static int vowelCounter(String s) {
        int[] counter = new int[127];

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i)]++;
        }

        return counter['a'] + counter['e'] + counter['i'] + counter['o'] + counter['u'];
    }
}
