package Stack;



public class Stack {

    // private static ArrayList<Integer> list = new ArrayList<>();

    // public boolean isEmpty() {

    // if (list.size() == 0) {
    // return true;
    // }
    // return false;
    // }

    // public void push(int data) {
    // list.add(data);
    // }

    // public int pop() {
    // if (isEmpty()) {
    // return -1;
    // }

    // int top = list.get(list.size() - 1);

    // list.remove(list.size() - 1);
    // return top;
    // }

    // public int peek() {
    // if (isEmpty()) {
    // return -1;
    // }

    // return list.get(list.size() - 1);
    // }

    public static Node head = null;

    public void push(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }

        newNode.next = head;
        head = newNode;

    }

    public int pop() {
        if (head == null) {
            return -1;
        }

        int top = head.data;

        head = head.next;

        return top;
    }

    public int peek() {
        if (head == null) {
            return -1;
        }

        return head.data;
    }

    public boolean isEmpty() {

        if (head != null) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Stack s = new Stack();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println(s.isEmpty());

        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

        Stack s = new Stack();

        System.out.println(s.isEmpty());

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s.peek());

        
    }
}

/**
 * InnerStack
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}