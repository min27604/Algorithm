package Programmers.LVL_1;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
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
}
public class Programmers_68644 {
    public static void main(String[] args) {
    }
}
