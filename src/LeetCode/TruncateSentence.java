package LeetCode;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(strings[i] + " ");
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
