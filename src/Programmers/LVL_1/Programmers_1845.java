package Programmers.LVL_1;

import java.util.HashSet;
import java.util.Set;

public class Programmers_1845 {
    public static int solution(int[] nums) {
        Set<Integer> poke = new HashSet<>();

        for (int i : nums) {
            poke.add(i);
        }

        return (nums.length / 2) > poke.size() ? poke.size() : nums.length;
    }
}
