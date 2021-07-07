package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counter = new HashMap<>();

        for (String domains : cpdomains) {
            int count = Integer.parseInt(domains.split(" ")[0]);
            String domain = domains.split(" ")[1];

            for (int i = domain.length() - 1; i >= 0; i--) {
                if (i == 0 || domain.charAt(i - 1) == '.') {
                    String subDomain = domain.substring(i);

                    if (!counter.containsKey(subDomain)) {
                        counter.put(subDomain, count);
                    } else {
                        counter.replace(subDomain, counter.get(subDomain) + count);
                    }
                }
            }
        }

        List<String> answer = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            answer.add(entry.getValue() + " " + entry.getKey());
        }

        return answer;
    }
}
