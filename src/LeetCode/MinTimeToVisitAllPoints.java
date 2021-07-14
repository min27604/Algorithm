package LeetCode;

public class MinTimeToVisitAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int answer = 0;
        for (int i = 0; i < points.length - 1; i++) {
            answer += distance(points[i], points[i + 1]);
        }

        return answer;
    }

    public int distance(int[] ptA, int[] ptB) {
        // (1, 1), (3, 4) 사이. 대각선, horizontal, vertical 한 칸씩 다 1초 걸리면 어쨌든 x, y축 차가 더 큰 수만큼 이동할 것
        int max = Math.max(Math.abs(ptA[0] - ptB[0]), Math.abs(ptA[1] - ptB[1]));

        return max;
    }
}
