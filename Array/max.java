public class max {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 23, 9, 10 };
    int a = max(arr);
    System.out.println(a);
  }

  // find the max element in the array
  static int max(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}