
import java.lang.Math;
import java.util.List;
public class Solution {
    static List<Integer> solution(int[] arr){
        List<Integer> ans = new java.util.ArrayList<>();
        //making a hashmap to store the frequency of each element
        // travel array and store the frequency of each element in the hashmap
    
    int n =arr.length;
    System.out.println(n);
    for(int index=0; index<n; index++){
        int value=Math.abs(arr[index]);
        int postion = value-1;
        // marking the element at the position as negative to indicate that it has been seen
        if(arr[postion]>0){
            arr[postion] = -arr[postion];
        }
       }
       for (int i = 0; i < n; i++) {
           if (arr[i] > 0) {
               int valueAtThisIndex = i + 1;
               ans.add(valueAtThisIndex);
           }
       }
    return ans;
}
    public static void main(String[] args) {
        int[] arr = {1,4,4,5,2,2};
        System.out.println("Missing numbers: " + solution(arr));
    }
}
