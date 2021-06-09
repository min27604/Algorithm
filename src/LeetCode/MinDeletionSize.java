package LeetCode;

public class MinDeletionSize {
    public int minDeletionSize(String[] strs) {
        int wordCount = strs.length;
        int length = strs[0].length();
        int counter = 0;

        for (int i = 0; i < length; i++) {
            String column = "";
            for (int j = 0; j < wordCount - 1; j++) {
                char a = strs[j].charAt(i);
                char b = strs[j + 1].charAt(i);
                if (a > b) {
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        MinDeletionSize m = new MinDeletionSize();
        System.out.println(m.minDeletionSize(new String[]{"rrjk","furt","guzm"}));
    }
}
