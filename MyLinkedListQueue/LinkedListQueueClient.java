package MyLinkedListQueue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(12);
        queue.enqueue(22);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(39);
        queue.enqueue(343);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
