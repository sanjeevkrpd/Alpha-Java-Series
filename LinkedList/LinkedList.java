package LinkedList;

public class LinkedList<T> {

    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Use appropriate generic type for head and tail
    private Node<T> head = null;
    private Node<T> tail = null;
    public static int size;

    public void add(T data) {

        Node<T> newNode = new Node<>(data);
        size++;
        newNode.data = data;

        if (head == null) {

            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addFirst(T data) {

        Node<T> newNode = new Node<>(data);
        size++;
        newNode.data = data;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(T data) {

        Node<T> newNode = new Node<>(data);
        size++;
        newNode.data = data;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public Node<T> getHead() {
        return head;
    }

    // Getter for tail
    public Node<T> getTail() {
        return tail;
    }

    public void print() {

        if (head == null) {
            System.out.println("LinkedList is Empty.");
            return;
        }

        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void add(int index, T data) {
        if (index == 0 || index == 1) {
            addFirst(data);
            return;
        }
        Node<T> newNode = new Node<>(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        int count = 1;
        Node<T> temp = head;
        Node<T> prev = null;

        while (count < index) {
            prev = temp;
            temp = temp.next;
            count++;
        }

        newNode.next = temp;
        prev.next = newNode;

    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }
        if (head.next == null) {
            // There's only one element in the list
            head = null;
            tail = null;
            size = 0;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
            return;
        }
        if (head.next == null) {
            // There's only one element in the list
            head = null;
            tail = null;
            size = 0;
        }

        else {
            Node<T> temp = head;
            // Traverse to the second-to-last node
            while (temp.next != tail) {
                temp = temp.next;
            }
            // Set the second-to-last node's next to null
            temp.next = null;
            // Update tail to the second-to-last node
            tail = temp;
            size--;
        }
    }

    public Integer itrSearch(Integer key) {

        if (head == null) {
            System.out.println("LinkedList is Empty.");
            return -1;
        }
        int idx = 0;
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }

        return -1;

    }

    public Integer helper(Node<T> head, T key) {
        if (head == null) {
            return -1;
        }

        if (head.data.equals(key)) {
            return 0;
        }

        Integer idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public Integer recSearch(T key) {
        return helper(head, key);
    }

    public void reverse() {
        if (head == null) {
            System.out.println("LinkedList is Empty.");
            return;

        }

        if (head.next == null) {

            return;
        }

        Node<T> curr = tail = head;
        Node<T> prev = null;
        Node<T> next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNthFromLast(int n) {
        if (head == null) {
            System.out.println("LinkedList is Empty.");
            return;
        }

        int sz = 0;
        Node<T> temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            ;
        }

        int i = 1;

        Node<T> prev = head;
        while (i < sz - n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    public Node<T> findMid(Node<T> head) {

        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public boolean checkPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        // step 1 find mid

        Node<T> mid = findMid(head);

        // step 2 reverse 2nd half

        Node<T> prev = null;
        Node<T> curr = mid;
        Node<T> next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node<T> right = prev;
        Node<T> left = head;

        /// step 3 left half and right half

        while (right != null) {

            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public boolean isCycle(Node<T> head) {

        if (head == null || head.next == null) {
            return false;
        }

        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next;

            if (slow == fast) {

                return true;
            }

        }
        return false;
    }

    public void removeCycle(Node<T> head) {

        if (head == null || head.next == null) {
            return;
        }

        Node<T> slow = head;
        Node<T> fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        Node<T> prev = null;
        slow = head;
        if (cycle) {

            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            prev.next = null;
        }
        System.out.println("Cycle Removed Successfully..");
    }

    private Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> ll = new Node<>(-1);
        Node<Integer> temp = ll;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return ll.next;
    }

    private Node<Integer> getMid(Node<Integer> head) {

        Node<Integer> slow = head;
        Node<Integer> fast = head.next;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public Node<Integer> mergeSort(Node<Integer> head) {
        // base case

        if (head == null || head.next == null) {
            return head;
        }

        // find mid

        Node<Integer> mid = getMid(head);

        // left and right MS
        Node<Integer> rightHead = mid.next;
        mid.next = null;

        Node<Integer> newLeft = mergeSort(head);
        Node<Integer> newRight = mergeSort(rightHead);

        // merge

        return merge(newLeft, newRight);

    }

    public void zigZag() {

        // find mid

        Node<T> slow = head;
        Node<T> fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half
        Node<T> mid = slow;
        Node<T> curr = mid.next;
        mid.next = null;

        Node<T> prev = null;
        Node<T> next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node<T> left = head;
        Node<T> right = prev;
        Node<T> nextL, nextR;

        // add in zig zag pattern

        while (left != null && right != null) {

            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

        // ll.add(1);

        // ll.add(2);

        // ll.add(2);
        // ll.add(1);
        // System.out.println(ll);
        // // ll.print();
        // // ll.removeLast();
        // // ll.removeLast();
        // // ll.print();
        // // System.out.println("Total size = " + ll.size);
        // // System.out.println(ll.getHead().data);
        // // System.out.println(ll.getTail().data);

        // // System.out.println(ll.itrSearch(4));
        // // System.out.println(ll.itrSearch(555));
        // // System.out.println();
        // // System.out.println(ll.recSearch(9999));
        // // System.out.println(ll.recSearch(333));

        // ll.print();
        // ll.removeNthFromLast(3);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        // Node<Integer> head = new Node<Integer>(1);
        // Node<Integer> node2 = new Node<Integer>(2);
        // Node<Integer> node3 = new Node<Integer>(3);
        // Node<Integer> node4 = new Node<Integer>(4);

        // head.next = node2;
        // node2.next = node3;
        // node3.next = node4;
        // node4.next = node2;

        // System.out.println(new LinkedList<Integer>().isCycle(head));
        // new LinkedList<Integer>().removeCycle(head);
        // System.out.println(new LinkedList<Integer>().isCycle(head));

        ll.add(1);

        ll.add(2);

        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.print();
        ll.zigZag();
        ll.print();

    }
}
