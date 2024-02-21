import java.util.Scanner;

    public class Test {

        public static void main(String[] args) {
            DoublyLinkedList<Integer>l= new DoublyLinkedList<>();
            Scanner in= new Scanner(System.in);
            int choice;
            while (true)
            {
                System.out.println("1 add first 2 add last 3 remove first " +
                        "4 first 5 last 6 size 7 view all 0 exit");
                choice=in.nextInt();
                switch (choice)
                {
                    case 1:
                        System.out.println("input a number to add in the first");
                        l.addFirst(in.nextInt());
                        System.out.println(l.first()+" is added successfully");
                        break;
                    case 2:
                        System.out.println("input a number to add in the last");
                        l.addlast(in.nextInt());
                        System.out.println(l.last()+" is added successfully");
                        break;
                    case 3:
                        System.out.println(l.removeFirst()+ " is removed successfully");
                        break;
                    case 4:
                        System.out.println(l.first()+ " is the first number");
                        break;
                    case 5:
                        System.out.println(l.last()+ " is the last number");
                        break;
                    case 6:
                        System.out.println("The size of this list is : "+l.size());
                        break;
                    case 7:
                        System.out.println("All list elements are : ");
                        while (!l.isEmpty())
                        {
                            System.out.print(l.removeFirst()+ " ");
                        }
                        break;
                    case 0:
                        System.exit(0);
                }
            }
        }
    }



