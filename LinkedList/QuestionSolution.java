package LinkedList;

public class QuestionSolution {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node getIntersectionNode(Node head1, Node head2) {

        while (head2 != null) {

            Node temp = head1;

            while (temp != null) {

                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public void skipMdeleteN(Node head, int M, int N) {

        if (head == null) {
            System.out.println("List is empty..");
            return;
        }

        Node temp = null, curr = head;
        while (curr != null) {

            for (int i = 1; i < M && curr != null; i++)

                curr = curr.next;

            if (curr == null) {

                return;
            }
            temp = curr.next;
            for (int j = 1; j <= N && temp != null; j++) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
    }

    public void swapNodes(Node head, int X, int Y) {

        Node curr = head;

        for (int i = 1; i < X; i++)
            curr = curr.next;

        Node temp2 = head;
        for (int i = 1; i < Y; i++) {
            temp2 = temp2.next;
        }

        int data = curr.data;
        curr.data = temp2.data;
        temp2.data = data;

    }

    public void arrangeInEvenOdd(Node head) {
        if (head == null)
            return;

        Node evenStart = null, evenEnd = null, oddStart = null, oddEnd = null;
        Node curr = head;

        while (curr != null) {
            int data = curr.data;

            if (data % 2 == 0) { // If the data is even
                if (evenStart == null) {
                    evenStart = curr;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            } else { // If the data is odd
                if (oddStart == null) {
                    oddStart = curr;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }

            curr = curr.next;
        }

        // If there are no even or no odd nodes, return without rearranging
        if (evenStart == null || oddStart == null) {
            return;
        }

        // Combine even and odd lists
        evenEnd.next = oddStart;
        oddEnd.next = null;

        // Update head to point to the new start of the list
        head = evenStart;
    }

    public static Node SortedMerge(Node a, Node b) {
        Node result = null;

        if (a == null) {

            return b;
        } else if (b == null) {
            return a;

        }

        if (a.data <= b.data) {

            result = a;
            result.next = SortedMerge(a, b.next);
        } else {
            result = b;
            result.next = SortedMerge(a.next, b);
        }
        return result;
    }

    public static void main(String[] args) {

        QuestionSolution list = new QuestionSolution();

        Node head1 = new Node(8);
        Node newNode2 = new Node(12);
        Node newNode3 = new Node(10);
        Node newNode6 = new Node(5);
        Node newNode7 = new Node(4);
        Node newNode8 = new Node(1);
        Node newNode9 = new Node(6);
        head1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode6;
        newNode6.next = newNode7;
        newNode7.next = newNode8;
        newNode8.next = newNode9;
        // // Creating second linked list
        // Node head2 = new Node(4);
        // Node newNode5 = new Node(5);

        // head2.next = newNode5;
        // newNode5.next = newNode6;
        // list.skipMdeleteN(head1, 2, 2);

        // list.swapNodes(head1, 2, 4);

        Node temp = head1;

        list.arrangeInEvenOdd(head1);
        // list.swapNodes(head1, 4, 5);

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");

    }

}
