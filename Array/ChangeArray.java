package Array;
import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        String arr[] = { "Amit", "kumar", "singh", "singh", "rajput" };
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr1));
        schange(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void change(String[] arr) {
        arr[0] = "Anjali";
    }

    static void schange(int[] arr1) {
        arr1[0] = 99;
    }
}
