//1
public class SinglyLinkedList{
    Node head;


    public boolean equals(Object obj) {
        // خطوة 1: التحقق مما إذا كان الكائن الممرر مرجعًا لنفس الكائن
        if (this == obj) {
            return true;
        }

        // خطوة 2: التحقق مما إذا كان الكائن الممرر فارغًا أو ليس من نوع SinglyLinkedList
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // خطوة 3: تحويل الكائن الممرر إلى نوع SinglyLinkedList
        SinglyLinkedList otherList = (SinglyLinkedList) obj;

        // خطوة 4: المقارنة بين عناصر القوائم
        Node currentNode = head;
        Node otherNode = otherList.head;

        while (currentNode != null && otherNode != null) {
            // المقارنة بين عناصر القوائم
            if (!currentNode.data.equals(otherNode.data)) {
                return false;
            }

            // تحريك إشارات القوائم للعناصر التالية
            currentNode = currentNode.next;
            otherNode = otherNode.next;
        }

        // خطوة 5: التحقق من تكافؤ أحجام القوائم
        if (currentNode != null || otherNode != null) {
            return false;
        }

        return true;
    }

    private static class Node {
        private Object data;
        private Node next;


    }

}
