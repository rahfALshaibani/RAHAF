//4
import java.util.Arrays;
public class ArrayStack1<E> implements Cloneable{
    private static final int DEFAULT_CAPACITY = 10; //السعة
    private E[] elements;
    private int size;

    public ArrayStack1() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
//انشاء نسخة
    @Override
    public ArrayStack1<E> clone() {
        try {
            ArrayStack1<E> clonedStack = (ArrayStack1<E>) super.clone();
            clonedStack.elements = Arrays.copyOf(elements, size);
            return clonedStack;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
}
