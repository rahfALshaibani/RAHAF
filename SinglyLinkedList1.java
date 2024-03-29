public class SinglyLinkedList1 <E>{
    private Node<E>head=null;
    private Node<E>tail=null;
    private int size=0;
    public SinglyLinkedList1() {}
    public int size(){
        return  size;
    }
    public  boolean isEmpty(){
        return  size==0;
    }
    public E first(){
        if (isEmpty())return  null;
        return head.getElement();
    }
    public  E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E e){
        head=new Node<>(e,head);
        if (size==0)
            tail=head;
        size++;
    }
    public void addLast(E e){
        Node<E>  newest=new Node<>(e,null);
        if (size==0)
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }
    public E removeFirst(){
        if (isEmpty())return null;
        E deleted= head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return deleted;
    }
/////////////////////////////////////////////////////
//3
public int size1() {
    int count = 0;
    Node head ;
    Node current = head;
    while (current != null) {
        count++; // زيادة العداد
        current = current.next; // تحريك المؤشر إلى العقدة التالية
    }

    return count;
}
/////////////////////////////////////////////////////////////////////////
//4
public void rotate() {
    if (head == null || head.next == null) {
        return;
    }

    Node current = head;

    while (current.next != null) {
        current = current.next;
    }

    current.next = head;
    head = head.next;
    current.next.next = null;
}
///////////////////////////////////////////////////////////
//5
    //دمج قائمتين
public SinglyLinkedList concatenate(SinglyLinkedList L, SinglyLinkedList M) {
    SinglyLinkedList concatenatedList = new SinglyLinkedList();

    if (L.head == null) {
        concatenatedList.head = M.head;
    } else if (M.head == null) {
        concatenatedList.head = L.head;
    } else {
        concatenatedList.head = L.head;

        Node current = L.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = M.head;
    }

    return concatenatedList;
}
////////////////////////////////////////////////////////////
    //6
    //قلب ترتيب العقد
public void reverse() {
    if (head == null || head.next == null) {
        return; // لا يوجد عقدة أو عقدة واحدة فقط في القائمة
    }

    Node current = head;
    Node next = null;
    Node previous = null;

    while (current != null) {
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }

    head = previous;
}
//////////////////////////////////////////////////////////////

    private  static  class Node<E>{
        E element;
        Node<E>next;

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node(E element, Node<E> next){
            this.element=element;
            this.next=next;

        }

    }
}


