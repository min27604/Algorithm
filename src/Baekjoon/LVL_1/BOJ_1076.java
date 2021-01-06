package Baekjoon.LVL_1;

import java.util.Scanner;

public class BOJ_1076 {
    public static void main(String[] args) {
        //전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다.
        //
        //처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다.
        String[][] resist = {{"black", "0", "1"}, {"brown", "1", "10"}, {"red", "2", "100"}, {"orange", "3", "1000"},
                {"yellow", "4", "10000"}, {"green", "5", "100000"}, {"blue", "6", "1000000"}, {"violet", "7", "10000000"},
                {"grey", "8", "100000000"}, {"white", "9", "1000000000"}};
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine();
        sc.close();

        long aValue = 0, bValue = 0, cValue = 0; // Using long since 'white' has a big #

        for (String[] strings : resist) {
            if (a.equals(strings[0])) {
                aValue += Integer.parseInt(strings[1]);
                System.out.println(aValue);
            }
            if (b.equals(strings[0])) {
                bValue = Integer.parseInt(strings[1]);
            }
            if (c.equals(strings[0])) {
                cValue = Integer.parseInt(strings[2]);
            }
        }

        long ans = ((aValue * 10) + bValue) * cValue;
        System.out.println(ans);
    }
}
