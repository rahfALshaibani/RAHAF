import java.util.Scanner;

    public class Test {
        public static void main(String[] args) {
            SinglyLinkedList1<Integer>l=new SinglyLinkedList1<>();
            Scanner in=new Scanner(System.in);
            int choice;
            while (true){

                System.out.println("1 add first 2 add last 3 remove first 4 first 5last 6 size 7 view all 0 exit ");

                l.addFirst(in.nextInt());
                System.out.println(l.first()+"is add successfully");
                break;
            }
        }
    }

