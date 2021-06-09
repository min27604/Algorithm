package LeetCode;

public class MinDeletionSize {
    public int minDeletionSize(String[] strs) {
        int wordCount = strs.length;
        int length = strs[0].length();
        int counter = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < wordCount - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }
}
