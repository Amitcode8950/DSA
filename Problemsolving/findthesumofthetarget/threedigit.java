import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
public class threedigit {
    static void findsum(int[] arr, int target){
        Set<List<Integer>> resultList = new HashSet<>();
        int n =arr.length;
        for(int i =0; i<n-2; i++){
            for(int j= i+1; j<n-1; j++){
                for(int k =j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        Collections.sort(triplet); // Sort the triplet to ensure uniqueness
                        resultList.add(triplet);
                    }
                }
            }

        }
        //return new ArrayList<>(resultList);
        System.out.println("The triplets are: "+resultList);
    }
    public static void main(String[] args) {
        int[] arr ={-1,0,1,2,-1,-4};
        int target = 0;
        findsum(arr, target);
    }
}
