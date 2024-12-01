import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlists {

    public static void main(String[] args) {
        LinkedList<Integer> lk1 = new LinkedList<>();
        lk1.add(1);
        lk1.add(2);
        lk1.add(3);
        
        ListIterator<Integer> iterator = lk1.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
    }
}