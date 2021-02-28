package Programmers.LVL_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programmers_42840 {
    public static int[] solution(int[] answers) {
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int s1Ans = 0;
        int s2Ans = 0;
        int s3Ans = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == s1[(i % 5)]) {
                s1Ans++;
            }
            if (answers[i] == s2[(i % 8)]) {
                s2Ans++;
            }
            if (answers[i] == s3[(i % 10)]) {
                s3Ans++;
            }
        }

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(s1Ans, s2Ans, s3Ans));
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (Collections.max(array).equals(array.get(i))) {
                a.add(i + 1);
            }
        }

        int[] answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++){
            answer[i] = a.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1,3,2,4,2};
        int[] ans = solution(array);
        for (int an : ans) {
            System.out.print(an + " ");
        }

    }
}
