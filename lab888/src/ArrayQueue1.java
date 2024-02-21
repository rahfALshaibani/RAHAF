//1.	Augment the ArrayQueue implementation with a new rotate( ) method having semantics
// identical to the combination, enqueue(dequeue( )).
// But, your implementation should be more efficient than making two separate calls
// (for example, because there is no need to modify the size).


import java.util.NoSuchElementException;

public class ArrayQueue1<E> {
    private E[] array;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue1(int capacity) {
        array = (E[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(E item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }

        rear = (rear + 1) % array.length;
        array[rear] = item;
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        E removedItem = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        size--;
        return removedItem;
    }

    public E rotate() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        E temp = array[front];
        array[front] = null;
        front = (front + 1) % array.length;
        rear = (rear + 1) % array.length;
        array[rear] = temp;

        return temp;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == array.length);
    }
    ////////////////////////////////////////////////////////
    /////////////////////////////////////////
    //////////////////////////////////////
    public static void main(String[] args) {
        ArrayQueue1<Integer> queue = new ArrayQueue1<>(5);

        // إضافة عناصر إلى الطابور الجاري
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // استخراج العناصر من بداية الطابور الجاري
        System.out.println(queue.dequeue()); // الناتج: 1
        System.out.println(queue.dequeue()); // الناتج: 2

        // دوران العناصر وإعادة ترتيبها
        queue.rotate();

        // إضافة عنصر جديد إلى الطابور الجاري
        queue.enqueue(6);

        // استخراج العناصر المتبقية من بداية الطابور الجاري
        System.out.println(queue.dequeue()); // الناتج: 3
        System.out.println(queue.dequeue()); // الناتج: 4
        System.out.println(queue.dequeue()); // الناتج: 5
        System.out.println(queue.dequeue()); // الناتج: 6
    }
}
