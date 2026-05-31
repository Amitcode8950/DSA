package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list.contains(1));
        // list.set(0, 100);
        // System.out.println(list);
        for(int i =0; i < 5; i++){
            list.add(in.nextInt());
        }

        for(int i =0; i < 5; i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}