package HackerRank;

import java.util.List;

public class Diagonal_Difference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int count = arr.size();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i);
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            sum2 += arr.get(arr.size() - 1 - i).get(i);
        }

        return Math.abs(sum1 - sum2);
    }

    public static int prac(int[][] arr) {
        int count = arr.length;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            System.out.print(arr[i][i] + ", ");
        }
        System.out.print(sum1);

        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            sum2 += arr[arr.length - 1 - i][i];
            System.out.print(arr[arr.length - 1 - i][i] + ", ");
        }
        System.out.print(sum2);

        System.out.println();
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        int[][] arr = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        System.out.println(prac(arr));
    }
}