package Programmers.LVL_1;

public class Programmers_42862 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i] - 1] += 1;
        }

        for (int i = 0; i < lost.length; i++) {
            students[lost[i] - 1] -= 1;
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (students[i] == -1) {
                if (i - 1 >= 0 && students[i - 1] == 1) {
                    answer++;
                    students[i] += 1;
                    students[i - 1] -= 1;
                } else if (i + 1 <= n - 1 && students[i + 1] == 1) {
                    answer++;
                    students[i] += 1;
                    students[i + 1] -= 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (students[i] == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[] {2, 4}, new int[] {1, 3, 5}));
    }
}
