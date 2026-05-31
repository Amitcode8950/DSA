import java.util.Arrays;

public class reverwap {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 23, 9, 10 };
        System.out.println(arr.length);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // find the max element in the array
    static int reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr[start];
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}