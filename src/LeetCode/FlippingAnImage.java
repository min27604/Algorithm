package LeetCode;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] answer = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                answer[i][j] = image[i][image[0].length - j - 1] == 0 ? 1 : 0;
            }
        }

        return answer;
    }
}
