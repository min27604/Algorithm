package Programmers.LVL_1;

import java.util.Stack;

public class Programmers_12906 {
    public static int[] solution(int []arr) {
        Stack<Integer> array = new Stack<>();
        array.push(-1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == array.peek()) {
                array.pop();
            }
            array.push(arr[i]);
        }

        int[] answer = new int[array.size() - 1];
        for (int i = 1; i < array.size(); i++) {
            answer[i - 1] = array.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 3, 3, 0, 1, 1};
        int[] b = {4, 4, 4, 3, 3};
        int[] ans = solution(b);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
