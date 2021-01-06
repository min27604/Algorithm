package Programmers.LVL_1;

public class Programmers_12919 {
    public static String solution(String[] seoul) {
        int a = -1;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                a = i;
            }
        }
        return "김서방은 " + Integer.toString(a) + "에 있다";
    }

    public static void main(String[] args) {
        String[] arr = {"Jane", "Kim"};
        System.out.println(solution(arr));
    }
}
