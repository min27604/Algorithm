package Programmers.LVL_1;

import java.util.ArrayList;
import java.util.Collections;

// 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
public class Programmers_68935 {
    public static int solution(int n) {
        ArrayList<Integer> ternary = new ArrayList<>();

        while (n > 0) {
            ternary.add(n % 3);
            n = (int) Math.floor(n / 3);
        }
        int answer = 0;
        Collections.reverse(ternary);
        System.out.println(ternary);
        for (int i = 0; i < ternary.size(); i++) {
            answer += ternary.get(i) * (Math.pow(3, i));
        }

        return answer;
    }

    public static void main(String[] args) {
        int i = 45, j = 125;
        System.out.println(solution(i));
        System.out.println(solution(j));
    }
}
