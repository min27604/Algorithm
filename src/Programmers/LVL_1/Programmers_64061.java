package Programmers.LVL_1;

import java.util.ArrayList;

public class Programmers_64061 {
    public static int solution(int[][] board, int[] moves) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 0) {
                    temp.add(board[i][j]);
                    break;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).equals(temp.get(i + 1))) {
                temp.remove(i);
                answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }
}
