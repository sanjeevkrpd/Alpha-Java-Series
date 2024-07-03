package Stack;

import java.util.Stack;

public class Solution {

    static class Node {
        Character data;
        Node next;

        Node(Character data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {

        Stack<Character> s = new Stack<>();

        Node temp = head;

        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {

            char ch = s.pop();

            if (temp.data != ch) {
                return false;
            }

            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Node one = new Node('A');
        Node two = new Node('B');
        Node three = new Node('C');
        Node four = new Node('K');
        Node five = new Node('A');

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        boolean condition = isPalindrome(one);

        System.out.println(condition);
    }

}
