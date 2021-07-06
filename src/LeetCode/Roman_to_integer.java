package LeetCode;

public class Roman_to_integer {
    public int romanToInteger(String s) {
        int[] numbers = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    numbers[i] = 1;
                    break;
                case 'V':
                    numbers[i] = 5;
                    break;
                case 'X':
                    numbers[i] = 10;
                    break;
                case 'L':
                    numbers[i] = 50;
                    break;
                case 'C':
                    numbers[i] = 100;
                    break;
                case 'D':
                    numbers[i] = 500;
                    break;
                case 'M':
                    numbers[i] = 1000;
                    break;
            }
        }

        int answer = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                answer -= numbers[i];
            } else {
                answer += numbers[i];
            }
        }
        answer += numbers[numbers.length - 1];

        return answer;
    }
}
