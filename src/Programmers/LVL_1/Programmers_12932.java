package Programmers.LVL_1;

// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

public class Programmers_12932 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length() - 1; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        answer[str.length() - 1] = (int)n;
        return answer;
    }
}
