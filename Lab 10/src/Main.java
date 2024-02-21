import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

ArrayList<Integer>arr= new ArrayList<>();
    arr.add(0,11);
    arr.add(1,11);
    arr.add(2,12);
    arr.add(3,13);
    Iterator<Integer> iter= arr.iterator();
    while (iter.hasNext())
    {
        System.out.println(iter.next());
    }


    }
}