package Programmers.LVL_1;


public class Programmers_12901 {

    public static String Solution(int a, int b) {
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int number = 0;
        if (a != 1) {
            for (int i = 0; i < a - 1; i++) {
                number += month[i];
            }
        }
        number = (number + b) % 7;
        return days[number];
    }
    public static void main(String[] args) {
        System.out.println(Solution(1, 10));
    }
}
