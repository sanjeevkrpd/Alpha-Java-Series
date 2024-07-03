package Stack;

import java.util.Stack;

public class StackA {

    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder();

        while (!s.isEmpty()) {
            char c = s.pop();
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        // Stack<Integer> s = new Stack<>();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);

        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }

        System.out.println(reverseString("abc"));
    }
}