import java.util.ArrayList;
import java.util.List;

public class colsum {
    static List<Integer> colsum(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int m= arr.length;
        int n =arr[0].length;
    for(int i =0; i<n; i++){
        int sum =0;
        for(int j =0; j<m;j++){
             int value = arr[j][i];
             sum =sum +value;
        }
        ans.add(sum);
    }


        return ans;
    }
    public static void main(String[] args) {
         int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> ans = colsum(arr);
        for(int k:ans){
            System.out.println(k);
        }
    
    }
}
