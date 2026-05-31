import java.util.Arrays;
public class min2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {99, 2, 3},
            {4, 5, 6,56},
            {7, 8, 9}
        };
        int min = 99;
        
        System.out.println(search(arr, min));
    }
    public static int search(int[][] arr, int min) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min =arr[i][j];
                }
            }
        }
        return min;
    }
}
