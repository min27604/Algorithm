package HackerRank;

public class Save_The_Prisoner {
    static int saveThePrisoner(int n, int m, int s) {
        int candyLeft = m;

        if ((n - (s - 1) > candyLeft)) {
            return (s - 1) + candyLeft;
        }
        candyLeft = candyLeft - (n - (s - 1));
        return (candyLeft % n == 0) ? n : candyLeft % n;
    }
}
