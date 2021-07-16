package Programmers.LVL_1;

public class Programmers_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int[] numbers = new int[absolutes.length];
        int answer = 0;
        int temp;
        for (int i = 0; i < absolutes.length; i++) {
            temp = absolutes[i];
            if (!signs[i]) {
                temp *= -1;
            }

            answer += temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        Programmers_76501 p = new Programmers_76501();
        System.out.println(p.solution(new int[]{4,6,12}, new boolean[]{true, false, true}));
    }
}
