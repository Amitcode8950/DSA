import java.util.ArrayDeque;
import java.util.Deque;

public class DequeinQueue {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(10);
        deque.offerFirst(20);
        deque.offerFirst(30);
        deque.offerFirst(40);
        deque.offerFirst(50);
        deque.offerLast(100);
        deque.offerLast(200);
        deque.offerLast(300);
        deque.offerLast(400);
        deque.offerLast(500);
        System.out.println(deque);   
        deque.pollLast();
        System.out.println(deque);
        deque.peekFirst();
        System.out.println(deque.peekFirst());
        deque.peekLast();
        System.out.println(deque.peekLast());
    } 
}
