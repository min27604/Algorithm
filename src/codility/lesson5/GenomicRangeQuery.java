package codility.lesson5;

public class GenomicRangeQuery {
    public static int[] solution(String S, int[] P, int[] Q) {
        int M = P.length;
        String[] queries = new String[M];
        int[] answer = new int[M];

        for (int i = 0; i < M; i++) {
            queries[i] = S.substring(P[i], Q[i]);
        }

        for (int i = 0; i < M; i++) {
            if (queries[i].contains("A")) {
                answer[i] = 1;
                continue;
            } else if (queries[i].contains("C")) {
                answer[i] = 2;
                continue;
            } else if (queries[i].contains("G")) {
                answer[i] = 3;
                continue;
            }
            answer[i] = 4;
        }

        return answer;
    }
}
