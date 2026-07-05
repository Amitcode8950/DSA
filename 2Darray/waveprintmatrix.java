import java.util.ArrayList;
import java.util.List;

public class waveprintmatrix {
    static List<Integer> runcode(int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        int n =arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            if((i & 1)==1){
                for(int j=m-1; j>=0; j--){
                    ans.add(arr[j][i]);
                }
            }else{
                for(int j =0;j<m; j++){
                    ans.add(arr[j][i]);
                }
            }
            
        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        List<Integer> ansshow = runcode(arr);
        for (int k : ansshow) {
            System.out.println(k);
        }

    }
}
