package Programmers.LVL_1;

// 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
// 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class P12915 {
    public String[] solution(String[] strings, int n) {
        int size = strings.length;
        List<String> str = new ArrayList<>(size);

        for (String string : strings) {
            str.add(string.charAt(n) + string);
        }

        sort(str);

        String[] answer = new String[size];
        for (int i = 0; i < size; i++) {
            answer[i] = str.get(i).substring(1);
        }

        return answer;
    }
}
