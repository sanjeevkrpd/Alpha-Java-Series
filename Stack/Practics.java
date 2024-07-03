package Stack;

import java.util.Stack;

public class Practics {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String s) {

        Stack<Character> c = new Stack<>();

        int idx = 0;
        while (idx < s.length()) {
            c.push(s.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!c.isEmpty()) {
            char pop = c.pop();
            result.append(pop);
        }

        return result.toString();

    }

    public static void reverseStack(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 100);

        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }

        // String result = reverseString("abc");
        // System.out.println(result);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
