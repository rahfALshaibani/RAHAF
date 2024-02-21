public class HW {
    //2
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        public LinkedList() {
            this.head = null;
        }


        public void addNode(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            }
            else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public Node findSecondToLastNode() {
            if (head == null || head.next == null) {
                return null;
            }

            Node current = head;
            while (current.next.next != null) {
                current = current.next; // تحريك المؤشر حتى نصل إلى العقدة قبل العقدة الأخيرة
            }

            return current; // إرجاع العقدة قبل العقدة الأخيرة
        }


        public void main(String[] args) {
            LinkedList list = new LinkedList();
            list.addNode(1);
            list.addNode(2);
            list.addNode(3);

            Node secondToLastNode = list.findSecondToLastNode();
            if (secondToLastNode != null) {
                System.out.println("Second-to-last node value: " + secondToLastNode.value);
            } else {
                System.out.println("There is no second-to-last node in the list.");
            }
        }
    }
///////////////////////////////////////////////////////////////////////////////
//3
//public int size() {
//    int count = 0;
//    Node head;
//    Node current = head;
//    while (current != null) {
//        count++; // زيادة العداد
//        current = current.next; // تحريك المؤشر إلى العقدة التالية
//    }
//
//    return count;
//}
///////////////////////////////////////////////////////////////////////////////
//4
//public void rotate() {
//    if (head == null || head.next == null) {
//        return; // لا يوجد عقدة أو عقدة واحدة فقط في القائمة
//    }
//
//    Node current = head; // المؤشر الحالي يشير إلى الرأس
//
//    while (current.next != null) {
//        current = current.next; // تحريك المؤشر حتى يصل إلى العقدة الأخيرة في القائمة
//    }
//
//    current.next = head; // ربط العقدة الأخيرة بالعقدة الأولى
//    head = head.next; // تحديث الرأس ليصبح العقدة الثانية في القائمة
//    current.next.next = null; // فصل العقدة الأولى من القائمة
//}


///////////////////////////////////////////////////////////////////////////////
//5
//public SinglyLinkedList concatenate(SinglyLinkedList L, SinglyLinkedList M) {
//    SinglyLinkedList concatenatedList = new SinglyLinkedList();
//
//    if (L.head == null) {
//        concatenatedList.head = M.head;
//    } else if (M.head == null) {
//        concatenatedList.head = L.head;
//    } else {
//        concatenatedList.head = L.head;
//
//        Node current = L.head;
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = M.head;
//    }
//
//    return concatenatedList;
//}
///////////////////////////////////////////////////////////////////////////////
//6
//public void reverse() {
//    if (head == null || head.next == null) {
//        return; // لا يوجد عقدة أو عقدة واحدة فقط في القائمة
//    }
//
//    Node current = head;
//    Node next = null;
//    Node previous = null;
//
//    while (current != null) {
//        next = current.next;
//        current.next = previous;
//        previous = current;
//        current = next;
//    }
//
//    head = previous;
//}
}
