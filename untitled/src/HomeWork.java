

public class HomeWork {
    //1
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node findMiddleNode(Node head) {
        if (head == null) {
            return null;
        }

        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }
    public class Main {
        public   void main(String[] args) {


            Node head = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);
            Node node4 = new Node(4);
            Node node5 = new Node(5);

            head.next = node2;
            node2.prev = head;
            node2.next = node3;
            node3.prev = node2;
            node3.next = node4;
            node4.prev = node3;
            node4.next = node5;
            node5.prev = node4;


            Node middleNode = findMiddleNode(head);

            if (middleNode != null) {
                System.out.println("العقدة الوسطى: " + middleNode.data);
            } else {
                System.out.println("القائمة فارغة.");
            }
        }
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//2
//public class DoublyLinkedList {
//    private Node head;
//    private Node tail;
//
//    public int size() {
//        int count = 0;
//        Node current = head;
//
//        while (current != null) {
//            count++;
//            current = current.next;
//        }
//
//        return count;
//    }
//}
///////////////////////////////////////////////////////////////////////////////////////////////
//3
//public class DoublyLinkedList {
//    private Node head;
//    private Node tail;
//    public boolean equals(DoublyLinkedList other) {
//        if (other == null) {
//            return false;
//        }
//
//        Node current1 = head;
//        Node current2 = other.head;
//
//        while (current1 != null && current2 != null) {
//            if (current1.data != current2.data) {
//                return false;
//            }
//
//            current1 = current1.next;
//            current2 = current2.next;
//        }
//
//
//        if (current1 == null && current2 == null) {
//            return true;
//        }
//
//        return false;
//    }
//
//

//}










///////////////////////////
// //////////////////////////////////////////////////////////////////
//4
//public class DoublyLinkedList4 {
//    //4
//    private Node head;
//    private Node tail;
//
//  دمج قائمتين
//
//    public DoublyLinkedList concatenate(DoublyLinkedList other) {
//        DoublyLinkedList concatenatedList = new DoublyLinkedList();
//
//        if (isEmpty()) {
//            concatenatedList.head = other.head;
//            concatenatedList.tail = other.tail;
//        } else if (other.isEmpty()) {
//            concatenatedList.head = head;
//            concatenatedList.tail = tail;
//        } else {
//            concatenatedList.head = head;
//            concatenatedList.tail = other.tail;
//            tail.next = other.head;
//            other.head.prev = tail;
//        }
//
//        return concatenatedList;
//    }
//
//
//}
//