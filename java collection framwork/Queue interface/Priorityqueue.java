import java.util.PriorityQueue;
import java.util.Collections;

public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q); 
       
        System.out.println( q.poll()); 
        System.out.println(q.peek());
        //min heap by default
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println(pq); 
        System.out.println( pq.poll()); 
        System.out.println(pq.peek());
    }
    
}
