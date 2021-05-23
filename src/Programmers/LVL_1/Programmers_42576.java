package Programmers.LVL_1;

import java.util.HashMap;

public class Programmers_42576 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participants = new HashMap<>();
        for (String p : participant) {
            int value = 0;
            if (participants.get(p) != null) {
                value = participants.get(p) + 1;
            }
            participants.put(p, value);
        }

        for (String completed : completion) {
            int value = participants.get(completed) - 1;
            participants.replace(completed, value);
        }

        for (String p : participant) {
            if (participants.get(p) == 0) {
                return p;
            }
        }

        return null;
    }
}
