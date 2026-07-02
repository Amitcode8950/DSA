import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class collectwaytoshort {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList<>();
        int arr[] = { 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            num.add(i);
            
        }
        Collections.sort(num);
        System.out.println(num);
    }
}
