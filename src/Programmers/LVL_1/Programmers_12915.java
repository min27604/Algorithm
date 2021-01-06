package Programmers.LVL_1;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_12915 {

    public String[] solution(String[] strings, int n) {
/*        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            str.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(str);

        String[] answer = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            answer[i] = str.get(i).substring(1);
        }

        return answer;
*/
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                } else if (o2.charAt(n) > o1.charAt(n)) {
                    return -1;
                } else { return o1.compareTo(o2); }
            }
        });
        return strings;
    }
}
