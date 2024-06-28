package examples.interviewquestions.queues;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);
        pq.add(2);
        pq.add(5);
        pq.add(1);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
