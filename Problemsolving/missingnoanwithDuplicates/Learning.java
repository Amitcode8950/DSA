
import java.lang.Math;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Learning {
    static void findMissingNumbers(int[] arr, int [] main) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
       
       for(int k=0; k<main.length; k++){
        if(!set.contains(main[k])){
            System.out.println("Missing number: " + main[k]);
        }
       }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 5, 2, 2};
        int[] main={1, 2, 3, 4, 5, 6};
       findMissingNumbers(arr,main);
        
    }
}
