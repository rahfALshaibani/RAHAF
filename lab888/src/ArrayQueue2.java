import Queue.Queue;

import java.util.Arrays;
//2.	Implement the clone( ) method for the ArrayQueue class.
public class ArrayQueue2<E> implements Cloneable , Queue<E> {
    private Object[] elements;
    private int size;
    private int front;
    private int rear;

    public ArrayQueue2(int capacity) {
        elements = new Object[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E first() {
        return null;
    }


    @Override
    public ArrayQueue2<E> clone() {
        ArrayQueue2<E> clonedQueue = new ArrayQueue2<>(elements.length);
        clonedQueue.size = size;
        clonedQueue.front = front;
        clonedQueue.rear = rear;
        clonedQueue.elements = Arrays.copyOf(elements, elements.length);
        return clonedQueue;
    }
    ///////////////////////////////////////////////////
    ///////////////////////////////////////////////////
    /////////////////////////////////////////
    public static void main(String[] args) {
        ArrayQueue2<String> myQueue = new ArrayQueue2<>(5);
        myQueue.enqueue("Alice");
        myQueue.enqueue("Bob");
        myQueue.enqueue("Charlie");

        System.out.println("Original queue: " + myQueue);

        // Create a clone of the queue
        ArrayQueue2<String> clonedQueue = myQueue.clone();

        // Modify the original queue
        myQueue.enqueue("David");

        System.out.println("Original queue after modification: " + myQueue);
        System.out.println("Cloned queue: " + clonedQueue);

        // Verify that the cloned queue is not affected by the modification
        if (!myQueue.equals(clonedQueue)) {
            System.out.println("Cloned queue is not affected by modification.");
        }
    }
}
