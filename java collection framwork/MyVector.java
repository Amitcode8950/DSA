import java.util.Vector;
import java.util.Collections;

public class MyVector {

    public static void main(String[] args) {
        Vector<Integer> var1 = new Vector<Integer>();
        var1.add(10);
        var1.add(15);
        var1.add(20);
        var1.add(100);
        var1.add(0);
        System.out.println(var1);
        var1.add(1, 5);
        System.out.println(var1);
        Collections.sort(var1);
        System.out.println(var1);
        
        Collections.reverse(var1);
        System.out.println(var1);
    }
}