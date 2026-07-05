import java.util.ArrayList;
import java.util.List;

public class sumoftwoD {
    static List<Integer> rowsum(int[][] arr) {
        List<Integer> result = new ArrayList<>();

       
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> ans = rowsum(arr);
        for(int k:ans){
            System.out.println(k);
        }
    }
}