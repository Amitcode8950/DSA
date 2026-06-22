import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.addFirst(5);
        list.addLast(40);
        System.out.println(list );
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);

      System.out.println(list.peek());
      System.out.println(list.poll());
      System.out.println(list);
      
    }
}
