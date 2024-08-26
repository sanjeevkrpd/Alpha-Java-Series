package Heap;

import java.util.PriorityQueue;

public class ConnectNRopes {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int ropes[] = {2,3,3,4,6};

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        System.out.println(pq);
        int cost = 0;
        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            // System.out.println(min);
            // System.out.println(min2);
            cost += min + min2;

            pq.add(min + min2);
            // System.out.println(cost);
        }
        System.out.println(cost);
    }
}
