import java.util.ArrayDeque;
import java.util.Deque;

public class stack {
    public static void main(String[] args) {
        Deque <Integer> p = new ArrayDeque<>();
        p.addLast(1);
        p.addLast(2);
        p.addLast(3);
        p.addLast(4);
        p.addLast(5);
        System.out.println(p); 
        p.pop();
        System.out.println(p); 
        System.out.println(p.peek());
    }
    
}
