package Programmers.LVL_1;

import java.util.Stack;

public class Programmers_64061 {
//    public static int solution(int[][] board, int[] moves) {
//        ArrayList<Integer> temp = new ArrayList<>();
//
//        for (int i = 0; i < moves.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                if (board[i][j] != 0) {
//                    temp.add(board[i][j]);
//                    break;
//                }
//            }
//        }
//
//        int answer = 0;
//        for (int i = 0; i < temp.size(); i++) {
//            if (temp.get(i).equals(temp.get(i + 1))) {
//                temp.remove(i);
//                answer ++;
//            }
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
//        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
//        System.out.println(solution(board, moves));
//    }

    public static Stack<Integer> solution(int[][] board, int[] moves) {
        Stack<Integer> baguni = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            baguni.push(findAnimal(board, moves[i]));
        }

        return baguni;
    }

    public static int findAnimal(int[][] board, int location) {
        for (int i = 0; i < board[location].length; i++) {
            if (board[location][i] != 0) {
                int animal = board[location][i];
                board[location][i] = 0;
                return animal;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        for (int i : solution(board, moves)) {
            System.out.println(i);
        }
    }
}
