import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
public class hashmap {
    static void hash(int[] arr){
       HashMap<Integer, Integer> map = new HashMap<>();
       List<Integer> List = new ArrayList<>();
       // Count the occurrences of each element in the array
       for(int i: arr){
           map.put(i, map.getOrDefault(i, 0)+1);
       }
       // Print the duplicate elements
       for(int i: map.keySet()){
          List.add(i);
       }
         System.out.println("The duplicate elements are: "+List);
      
       
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,2,3,3,4 };
        hash(arr);
    }
}
