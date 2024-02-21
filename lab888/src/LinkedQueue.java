import Queue.Queue;

import java.util.LinkedList;
//3

public class LinkedQueue<E> implements Queue<E> {
    LinkedList<E>l= new LinkedList<>();
    @Override
    public int size() {
        return l.size();
    }

    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }

    @Override
    public void enqueue(E e) {
              l.addFirst(e);
    }

    @Override
    public E dequeue() {
        return l.removeLast();
    }

    @Override
    public E first() {
        return l.getLast();
    }
//دمج
    public void concatenate(LinkedQueue<E> myQueue) {
        while (!myQueue.isEmpty()) {
            E element = myQueue.dequeue();
            enqueue(element);
        }
    }
}
