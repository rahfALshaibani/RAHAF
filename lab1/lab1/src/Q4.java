import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int [] num= new int[4];
        for (int p=0;p<=num.length;p++){
            System.out.println("the number : "+p);
            num[p]=myScan.nextInt();

        }
    }
}
