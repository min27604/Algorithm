package codility.lesson4;

// increase(X) = ++CounterX;
// max : allCounter = Max.allCounter;
public class MaxCounter {
    public static int[] solution(int N, int[] A) {
        int[] answer = new int[N];
        int max = 0;
        int prevMax = 0;

        for (int i : A) {
            if (i <= N) {
                answer[i - 1] = Math.max(prevMax, answer[i - 1]);
                answer[i - 1]++;
                max = Math.max(max, answer[i - 1]);
                continue;
            }
            prevMax = max;
        }

        for (int i = 0; i < N; i++) {
            if (answer[i] < prevMax) {
                answer[i] = prevMax;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {3, 4, 4, 6, 1, 4, 4};
        int[] ans = solution(n, a);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
