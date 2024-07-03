package Stack;

import java.util.Stack;

public class MaxAreaInHistogram {

    public static void main(String[] args) {

        int heights[] = { 2, 1, 5, 6, 2, 3 };
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];
        int max = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();

        // next smaller right

        for (int i = heights.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }

            s.push(i);
        }

        // next smaller left

        for (int i = 0; i < heights.length; i++) {

            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = heights.length;
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // area

        for (int i = 0; i < heights.length; i++) {

            int h = heights[i];

            int w = nsr[i] - nsl[i] - 1;

            int currArea = h * w;

            max = Math.max(max, currArea);
        }

        System.out.println("Max Area of rectangle in histogram :  " + max);
    }
}