package DailyPractics;

import java.util.PriorityQueue;

public class KthLagrestElement {

    public static int kLargestElement(int[] arr, int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for (Integer i : arr) {
            
            pq.add(i);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        
        int arr[] ={3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(kLargestElement(arr, k));
    }
}
