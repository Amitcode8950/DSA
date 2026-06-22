import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class stack {
    public static void main(String[] args) {

        Stack<Integer> list = new Stack<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.addFirst(5);
        list.addLast(40);
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
        list.push(20);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        System.out.println(list.search(10));
        System.out.println(list.peek());
        System.out.println(list.empty());
        System.out.println(list);

    }
}
