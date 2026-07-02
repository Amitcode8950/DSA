import java.util.HashMap;
public class has{
    static int hashint(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
         for(int nums :arr){
            map.put(nums, map.getOrDefault(nums, 0)+1);

         }
         for(int i :arr){
            if(map.get(i)>1){
                return i;
            }

         }
        return -1; // Return -1 if no duplicate is found
    }
   
    
    public static void main(String[] args) {
        int [] arr = {10,5,3,4,3,5,6};
       int result = hashint(arr);
       System.out.println("The first repeating element is: " + result);
    }
}