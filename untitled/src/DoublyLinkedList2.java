public class DoublyLinkedList2 {
   //5
        private Node S;
        private int size;

        private class Node {
            int data;
            Node prev;
            Node next;

            public Node(int data) {
                this.data = data;
            }
        }

        public DoublyLinkedList2() {
            S = new Node(-1);
            S.next = S;
            S.prev = S;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = S.next;
            newNode.prev = S;
            S.next.prev = newNode;
            S.next = newNode;
            size++;
        }

        public void addLast1(int data) {
            Node newNode = new Node(data);
            newNode.next = S;
            newNode.prev = S.prev;
            S.prev.next = newNode;
            S.prev = newNode;
            size++;
        }


    }

