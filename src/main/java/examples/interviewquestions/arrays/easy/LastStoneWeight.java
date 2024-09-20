package examples.interviewquestions.arrays.easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            if (stone1 != stone2) {
                maxHeap.add(stone1 - stone2);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        LastStoneWeight solution = new LastStoneWeight();
        int[] stones1 = {2, 7, 4, 1, 8, 1};
        System.out.println(solution.lastStoneWeight(stones1));

        int[] stones2 = {1};
        System.out.println(solution.lastStoneWeight(stones2));
    }
}
