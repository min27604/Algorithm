package LeetCode;

import java.util.Arrays;

public class Assign_cookies {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int answer = 0;
        int gLen = g.length;
        int sLen = s.length;
        int i = 0;
        int j = 0;

        while (i < gLen && j < sLen) {
            if (g[i] <= s[j]) {
                answer++;
                i++;
                j++;
            } else {
                j++;
            }
        }

        return answer;
    }
}
