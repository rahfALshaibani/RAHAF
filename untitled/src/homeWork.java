public class homeWork {












    /////////////////////////////////////
    //1
//    public void addFirst(E element) {
//        Node<E> newest = new Node<>(element, null);
//
//        if (isEmpty()) {
//            newest.next = newest;
//            tail = newest;
//        } else {
//            newest.next = tail.next;
//            tail.next = newest;
//        }
//
//        size++;
    }

/////////////////////////////////////////////
///////////////////////////////////////////////////////////////////
//2
//public int size() {
//    if (tail == null) {
//        return 0;
//    }
//
//    int count = 1;
//
//    Node<E> current = tail;
//    while (current.next != tail) {
//        count++;
//        current = current.next;
//    }
//
//    return count;
//}
////////////////////////////////////////////////////////////////////////////////////
//3
//public boolean equals(Object obj) {
//    if (this == obj) {
//        return true;
//    }
//
//    if (!(obj instanceof CircularlyLinkedList)) {
//        return false;
//    }
//    CircularlyLinkedList<E> other = (CircularlyLinkedList<E>) obj;
//    if (size() != other.size()) {
//        return false;
//    }
//
//    if (isEmpty()) {
//        return true;
//    }
//
//    Node<E> currentThis = tail.next;
//    Node<E> currentOther = other.tail.next;
//
//    while (currentThis != tail) {
//        if (!currentThis.element.equals(currentOther.element)) {
//            return false;
//        }
//        currentThis = currentThis.next;
//        currentOther = currentOther.next;
//    }
//
//    return currentThis.element.equals(currentOther.element);
//}

///////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//4
//public boolean isSameList(Node<E> head1, Node<E> head2) {
//
//    if (head1 == null && head2 == null) {
//        return true;
//    }
//
//
//    if (head1 == null || head2 == null) {
//        return false;
//    }
//
//
//    Node<E> current1 = head1;
//    Node<E> current2 = head2;
//
//
//    do {
//
//        if (!current1.element.equals(current2.element)) {
//            return false;
//        }
//
//
//        current1 = current1.next;
//        current2 = current2.next;
//
//
//    } while (current1 != head1 && current2 != head2);
//
//
//    return current1 == head1 && current2 == head2;
//}



///////////////////////////////////////////////////////////////////////////////////
// ///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//5
//تقسيم قائمة دائرية تحتوي على عدد زوجي من العقد إلى قائمتين دائريتين متساويتين في الحجم.
//public static void splitList(Node<E> head) {
//    if (head == null || head.next == head) {
//        return null;
//    }
//
//
//    Node<E> slow = head, fast = head.next;
//    while (fast != head && fast.next != head) {
//        slow = slow.next;
//        fast = fast.next.next;
//    }
//
//
//    Node<E> secondHead = slow.next;
//    slow.next = secondHead.next;
//    secondHead.next = secondHead;
//
//
//    head = secondHead;
//}

///////////////////////////////////////////////////////////////////////////////////
// ///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////
