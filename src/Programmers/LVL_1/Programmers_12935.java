package Programmers.LVL_1;

public class Programmers_12935 {
    public int[] solution(int[] arr) {
        int length = arr.length;
        if (length == 1) {
            return new int[]{-1};
        }

        int minIndex = 0;

        for (int i = 1; i < length; i++) {
            minIndex = arr[i] < arr[minIndex] ? i : minIndex;
        }

        int[] answer = new int[length - 1];

        for (int i = 0; i < length; i++) {
            if (i < minIndex) {
                answer[i] = arr[i];
            }

            if (i == minIndex) {
                continue;
            }

            if (i > minIndex) {
                answer[i - 1] = arr[i];
            }
        }
        return answer;
    }
}
