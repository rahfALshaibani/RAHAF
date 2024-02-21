
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//1

        Stack<Integer> stackS = new Stack<>();
        Stack<Integer> stackT = new Stack<>();


        stackS.push(1);
        stackS.push(2);
        stackS.push(3);
        stackS.push(4);
        stackS.push(5);

        transfer(stackS, stackT);

        while (!stackT.isEmpty()) {
            System.out.println(stackT.pop());
        }
    }


    public static void transfer(Stack<Integer> stackS, Stack<Integer> stackT) {

        while (!stackS.isEmpty()) {
            stackT.push(stackS.pop());
        }





    }
}