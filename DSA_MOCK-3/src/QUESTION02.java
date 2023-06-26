/*
  Implement a queue using a linked list in Java. Include the necessary methods such as enqueue, dequeue, and isEmpty.
 */
public class QUESTION02 {
    private Node front;
    private Node rear;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public QUESTION02() {
        front = null;
        rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Enqueued element: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1; 
        } else {
            int dequeuedElement = front.data;
            front = front.next;

            if (front == null) {
                rear = null;
            }

            return dequeuedElement;
        }
    }

    public boolean isEmpty() {
        return (front == null && rear == null);
    }

    public static void main(String[] args) {
        QUESTION02 queue = new QUESTION02();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
