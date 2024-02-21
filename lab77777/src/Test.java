
    import java.util.Scanner;

    public class Test {
        public static void main(String[] args) {
            ArrayStack<String>s=new ArrayStack<>(5);
            Scanner in=new Scanner(System.in);
            int choice;
            while (true){
                System.out.println("1 push name to pop name"+"3show top"+"" +
                        "for stack size 5 is the stack empty 6 view all");
                choice=in.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("input a name to push");
                        s.push(in.next());
                        System.out.println(s.top()+"is add");
                        break;
                    case 2:
                        System.out.println(s.top()+"is add");
                        break;
                    case 3:
                        System.out.println(s.top()+"is add");
                        break;
                    case 4:
                        System.out.println(s.size()+"is add");
                        break;
                    case 5:
                        System.out.println(s.isEmpty()+"is add");
                        break;
                    case 6:
                        System.out.println("is add");
                        while (!s.isEmpty());

                }

            }
        }
    }


