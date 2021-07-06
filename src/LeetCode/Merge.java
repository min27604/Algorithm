package LeetCode;

import java.util.Arrays;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num1 = new int[m];
        num1 = Arrays.copyOfRange(nums1, 0, m);
        int counter = Math.max(m, n);
        int index = 0;

        for (int i = 0; i < counter; i++) {
            if (m > i) {
                nums1[index] = num1[i];
                index++;
            }
            if (n > i) {
                nums1[index] = nums2[i];
                index++;
            }
        }

        Arrays.sort(nums1);
    }
}
