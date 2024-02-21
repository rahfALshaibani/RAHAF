import java.util.Scanner;

public class Q6 {
    public static void myMothodInput(int[] r) {
        Scanner myO = new Scanner(System.in);
        for (int l : r) {
            System.out.println(l);
            l = myO.nextInt();

        }
    }

    public static void main(String[] args) {
        int[] num = new int[4];

        myMothodInput(num);
    }
}