package Programmers.LVL_1;

// 1-1. 입력된 수가 짝수라면 2로 나눕니다.
// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
// 예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다.
// 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.

public class Programmers_12943 {
    public static int solution(int num) {
        int counter = 0;
        long temp = num; // 처음엔 int로 했으나 테스트케이스 626331을 할 때 오버플로우 발생

        while (temp != 1) {
            temp = collatz(temp);
            counter++;
            if (counter > 499) {
                counter = -1;
                break;
            }
        }

        return counter;
    }

    private static long collatz(long num) {
        long result = num;
        if (result % 2 == 0) {
            result /= 2;
        } else {
            result = result * 3 + 1;
        }
        return result;
    }
}
