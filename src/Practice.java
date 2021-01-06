import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String[][] resist = {{"black", "0", "1"}, {"brown", "1", "10"}, {"red", "2", "100"}, {"orange", "3", "1000"},
                {"yellow", "4", "10000"}, {"green", "5", "100000"}, {"blue", "6", "1000000"}, {"violet", "7", "10000000"},
                {"grey", "8", "100000000"}, {"white", "9", "1000000000"}};
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine();
        sc.close();

        long aValue = 0, bValue = 0, cValue = 0;

        for (int i = 0; i < resist.length; i++) {
            if (a.equals(resist[i][0])) {
                aValue += Integer.parseInt(resist[i][1]);
                System.out.println(aValue);
            }
            if (b.equals(resist[i][0])) {
                bValue = Integer.parseInt(resist[i][1]);
            }
            if (c.equals(resist[i][0])) {
                cValue = Integer.parseInt(resist[i][2]);
            }
        }

        long ans = ((aValue * 10) + bValue) * cValue;
        System.out.println(ans);
    }
}