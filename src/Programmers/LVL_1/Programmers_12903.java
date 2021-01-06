package Programmers.LVL_1;

// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

public class Programmers_12903 {
    public static String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            answer += s.charAt(s.length() / 2 - 1);
            answer += s.charAt(s.length() / 2);
        }
        if (s.length() % 2 == 1) {
            answer += s.charAt((int)(Math.floor(s.length() / 2)));
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String a = "qwer";
        System.out.println(solution(s));
        System.out.println(solution(a));
    }
}
