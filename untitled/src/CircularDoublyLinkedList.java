import java.util.NoSuchElementException;

//6
public class CircularDoublyLinkedList {
    private Node head;
    private int size;

    private class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public CircularDoublyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }

        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }

        if (size == 1) {
            head = null;
        } else {
            head.next.prev = head.prev;
            head.prev.next = head.next;
            head = head.next;
        }

        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }

        if (size == 1) {
            head = null;
        } else {
            head.prev.prev.next = head;
            head.prev = head.prev.prev;
        }

        size--;
    }

    public void rotate() {
        if (!isEmpty()) {
            head = head.next;
        }
    }

    public void rotateBackward() {
        if (!isEmpty()) {
            head = head.prev;
        }
    }
}


