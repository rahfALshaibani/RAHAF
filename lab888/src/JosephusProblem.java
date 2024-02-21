import java.util.LinkedList;
import java.util.Queue;
//4
public class JosephusProblem {
        public static int josephus(int n, int k) {
            Queue<Integer> queue = new LinkedList<>();

            // إضافة الأشخاص المشاركين إلى الصف
            for (int i = 0; i < n; i++) {
                queue.add(i);
            }

            while (queue.size() > 1) {
                // الدور على الشخص الذي سيتم إزالته
                for (int i = 0; i < k - 1; i++) {
                    // نقل الشخص إلى نهاية الصف
                    int person = queue.remove();
                    queue.add(person);
                }

                // إزالة الشخص الحالي
                queue.remove();
            }

            // الشخص الأخير المتبقي
            return queue.peek();
        }

        public static void main(String[] args) {
            int n = 7; // عدد الأشخاص
            int k = 3; // خطوات العد

            int survivor = josephus(n, k);
            System.out.println("The last survivor is: " + survivor);
        }
    }

