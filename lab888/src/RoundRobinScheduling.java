import java.util.LinkedList;
import java.util.Queue;
//5
public class RoundRobinScheduling {



        public static void roundRobinScheduling(int[] burstTimes, int timeQuantum) {
            Queue<Integer> queue = new LinkedList<>();

            int n = burstTimes.length;
            int[] remainingTimes = new int[n];
            int currentTime = 0;

            // إضافة جميع العمليات إلى الصف
            for (int i = 0; i < n; i++) {
                queue.add(i);
                remainingTimes[i] = burstTimes[i];
            }

            while (!queue.isEmpty()) {
                int currentProcess = queue.remove();

                // قصر وقت الانفجار عند استخدام الوحدة الزمنية
                if (remainingTimes[currentProcess] > timeQuantum) {
                    remainingTimes[currentProcess] -= timeQuantum;
                    currentTime += timeQuantum;

                    // إضافة العملية المقتصرة إلى نهاية الصف
                    queue.add(currentProcess);
                } else {
                    currentTime += remainingTimes[currentProcess];
                    remainingTimes[currentProcess] = 0;

                    System.out.println("Process " + currentProcess + " executed. Completion Time: " + currentTime);
                }
            }
        }

        public static void main(String[] args) {
            int[] burstTimes = {10, 4, 5, 3}; // قائمة بأوقات الانفجار
            int timeQuantum = 2; // الوحدة الزمنية

            roundRobinScheduling(burstTimes, timeQuantum);
        }
    }

