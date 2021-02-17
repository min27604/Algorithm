package Programmers.LVL_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programmers_68644 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> sumList = new ArrayList<>();
        int sum;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (!(sumList.contains(sum))) {
                    sumList.add(sum);
                }
            }
        }

        Collections.sort(sumList);

        int[] answer = new int[sumList.size()];
        for (int i = 0; i < sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }
        return answer;
    }

    public int[] solution2(int[] numbers) {

        List<Integer> sumList = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (!sumList.contains(sum)) {
                    sumList.add(sum);
                }
            }
        }

        int[] answer = new int[sumList.size()];

        for (int i = 0; i < sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
