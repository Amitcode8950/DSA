import java.util.Arrays;
public class maxin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6,56},
            {7, 8, 9}
        };
        int max = 0;
        
        System.out.println(search(arr, max));
    }
    public static int search(int[][] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max =arr[i][j];
                }
            }
        }
        return max;
    }
}
