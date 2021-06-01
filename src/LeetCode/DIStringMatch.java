package LeetCode;

public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int[] answer = new int[s.length() + 1];
        int start = 0;

        if (s.charAt(0) == 'D') {
            start = 1;
        }

        for (int i = start; i < answer.length - 1; i++) {
            if (s.charAt(i) == 'I') {
                answer[i + 1]++;
                continue;
            }

            answer[i]++;
        }
        return answer;
    }
}
