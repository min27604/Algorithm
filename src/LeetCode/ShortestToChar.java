package LeetCode;

public class ShortestToChar {
    public int[] shortestToChar(String s, char c) {
        int[] answer = new int[s.length()];
        int index = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                index = i;
            }

            answer[i] = Math.abs(i - index);
        }

        index = s.length() + 10;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == c) {
                index = i;
            }

            answer[i] = Math.min(answer[i], Math.abs(i - index));
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE / 2);
    }
}
