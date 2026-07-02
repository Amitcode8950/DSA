import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class array {

    public static void main(String[] args) {
        int[] arr = new int[5];
        // input in array
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // output in array
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }

        // other way to taking output in this array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
}