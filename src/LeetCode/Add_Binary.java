package LeetCode;

public class Add_Binary {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int aIndex = a.length() - 1, bIndex = b.length() - 1;
        int sum = 0;

        while (aIndex >= 0 || bIndex >= 0) {
            if (aIndex >= 0) {
                sum += a.charAt(aIndex) - 48;
            }
            if (bIndex >= 0) {
                sum += b.charAt(bIndex) - 48;
            }

            answer.append(sum % 2);
            sum /= 2;
            aIndex--;
            bIndex--;
        }

        if (sum == 1) {
            answer.append(sum);
        }

        return answer.reverse().toString();
    }

// 이렇게 푸는 게 아니다..
//    public String dec2bin(int integer) {
//        String bin = "";
//        while (integer > 0) {
//            bin += Integer.toString(integer % 2);
//            integer /= 2;
//        }
//        return bin;
//    }
//
//    public long bin2dec(String bin) {
//        long counter = 0;
//        long dec = 0;
//        for (int i = bin.length() - 1; i >= 0; i--) {
//            dec += (bin.charAt(i) - 48) * Math.pow(2, counter);
//            counter++;
//        }
//        return dec;
//    }
}
