package LeetCode;

public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        int temp = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                temp += accounts[i][j];
            }

            richest = Math.max(richest, temp);
            temp = 0;
        }

        return richest;
    }
}
