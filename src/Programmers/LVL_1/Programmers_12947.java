package Programmers.LVL_1;

// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

public class Programmers_12947 {
    public boolean solution(int x) {
        int temp = x;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        boolean answer = true;
        if (x % sum != 0) {
            answer = false;
        }

        return answer;
    }
}
