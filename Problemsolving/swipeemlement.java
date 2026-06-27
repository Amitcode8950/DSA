public class swipeemlement {
    static int[] swipe(int[] arr) {
        int lenght = arr.length;
        int[] newarray = new int[lenght];
        for (int i = 0; i < lenght; i=i+2) {
            int a = arr[i];
            int b = arr[i + 1];
            newarray[i + 1] = a;
            newarray[i] = b;

        }
        return newarray;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int[] ans = swipe(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
