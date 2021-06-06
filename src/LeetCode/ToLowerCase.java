package LeetCode;

public class ToLowerCase {
    public String toLowerCase(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                answer += (char) (s.charAt(i) + 32);
                continue;
            }

            answer += s.charAt(i);
        }

        return answer;
    }
}
