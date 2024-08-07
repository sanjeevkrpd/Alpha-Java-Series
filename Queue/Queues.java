package Queue;

public class Queues {

    static class QueueB {

        int arr[];
        int size;
        int rear;
        int front;

        QueueB(int n) {
            size = n;
            arr = new int[size];
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            // add first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int result = arr[front];

            // last element delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty...");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {

        QueueB q = new QueueB(3);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove()); // 1
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
