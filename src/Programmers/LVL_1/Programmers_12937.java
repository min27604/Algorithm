package Programmers.LVL_1;

//정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
public class Programmers_12937 {
    public String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}
