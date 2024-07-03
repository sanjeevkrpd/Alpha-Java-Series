package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Problems {

    // stock span problem

    public static void stockSpan(int stocks[], int span[]) {

        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {

            int currPrice = stocks[i];

            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {

        // int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };

        // int span[] = new int[stocks.length];

        // stockSpan(stocks, span);

        // System.out.println(Arrays.toString(span));

        //

        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();

        /*
         * // next greater
         * int nxtGreater[] = new int[arr.length];
         * 
         * Stack<Integer> s = new Stack<>();
         * 
         * for (int i = arr.length - 1; i >= 0; i--) {
         * // 1st step
         * 
         * while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
         * s.pop();
         * }
         * 
         * // 2nd step
         * 
         * if (s.isEmpty()) {
         * nxtGreater[i] = -1;
         * } else {
         * nxtGreater[i] = arr[s.peek()];
         * }
         * 
         * // 3rd step
         * 
         * s.push(i);
         * }
         * 
         * System.out.println(Arrays.toString(nxtGreater));
         * 
         */
        // next smaller

        int nxtSmaller[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            // 1st step

            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nxtSmaller[i] = -999;
            } else {
                nxtSmaller[i] = arr[s.peek()];
            }

            s.push(i);
        }

        System.out.println(Arrays.toString(nxtSmaller));

    }
}
