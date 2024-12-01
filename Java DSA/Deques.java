import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2);
        System.out.println(dq);
        dq.offerLast(3);
        dq.offerLast(4);
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peek());
        dq.peek();
    }
}
