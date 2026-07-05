import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class timeless {
    static List<Integer> kadane(int[] arr) {
       List <Integer> list = new ArrayList<>();
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
         list.add(arr[i]);
            sum = sum + arr[i];
            maxi = Math.max(maxi, sum);
            if (sum < 0) {
                sum = 0;
                list.removeAll(list);
            }
        }
      return list;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
       List <Integer> myList =kadane(arr);
       for(int i: myList){
        System.out.println(i);
       }
}
}
