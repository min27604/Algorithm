package Programmers.LVL_2;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Programmers_42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int timeConsumed = 0;
        int currentWeight = 0;
        Queue<Integer> bridge = new ConcurrentLinkedQueue<>();

        for (int truck_weight : truck_weights) {
            while (true) {
                if (bridge.isEmpty()) {
                    bridge.add(truck_weight);
                    currentWeight += truck_weight;
                    timeConsumed++;
                    break;
                }
                if (bridge.size() == bridge_length) {
                    currentWeight -= bridge.poll();
                }
                if (currentWeight + truck_weight <= weight) {
                    bridge.add(truck_weight);
                    currentWeight += truck_weight;
                    timeConsumed++;
                    break;
                } else {
                    bridge.add(0);
                    timeConsumed++;
                }
            }
        }

        return timeConsumed + bridge_length;
    }
}
