package Programmers.LVL_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers_42748 {

    // [i, j, k]
    // i~j, k-th number
    public int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[length];

        for (int i : array) {
            list.add(i);
        }

        for (int i = 0; i < length; i++) {
            List<Integer> integers = list.subList(commands[i][0] - 1, commands[i][1]);
            Object[] objects = integers.toArray();
            Arrays.sort(objects);

            answer[i] = (int) objects[commands[i][2] - 1];
        }

        return answer;
    }
}
