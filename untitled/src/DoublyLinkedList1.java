//7


    public class DoublyLinkedList1 implements Cloneable {
        private Node head;
        private Node tail;

        private class Node {
            int data;
            Node prev;
            Node next;

            public Node(int data) {
                this.data = data;
            }
        }
        //انشاء نسخة


        @Override
        public DoublyLinkedList clone() {
            DoublyLinkedList clonedList = new DoublyLinkedList();

            if (head == null) {
                return clonedList;
            }

            Node currentNode = head;
            while (currentNode != null) {
                clonedList.addLast(currentNode.data);
                currentNode = currentNode.next;
            }

            return clonedList;
        }

        private void addLast(int data) {
        }

    }











