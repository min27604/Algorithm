package codility.lesson1;

public class BinaryGap {
    public static int solution(int N) {
        String bin = Integer.toBinaryString(N);
        char[] chars = bin.toCharArray();

        int answer = 0;
        int counter = 0;

        for (char c : chars) {
            if (c == '0') {
                counter++;
                continue;
            }
            if (counter > answer) {
                answer = counter;
            }
            counter = 0;
        }

        return answer;
    }

    public static int solution2(int N) {
        String bin = Integer.toBinaryString(N);

        int answer = 0;
        int counter = 0;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '0') {
                counter++;
                continue;
            }
            if (counter > answer) {
                answer = counter;
            }
            counter = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(32));
    }
}
