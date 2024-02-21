import java.util.Stack;

public class Main2{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // قم بإضافة بعض العناصر إلى الستاك
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        removeAllElements(stack);


        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


    public static void removeAllElements(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            stack.pop();
            removeAllElements(stack);
        }
    }
}