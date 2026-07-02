
public class Xor {
    static void findmissing(int [] main, int [] arr){
        int xor1 = main[0];
        int xor2 = arr[0];
        for (int i = 1; i < main.length; i++) {
            xor1 ^= main[i];
        }
        for (int i = 1; i < arr.length; i++) {
            xor2 ^= arr[i];
        }
        System.out.println("Missing number is: " + (xor1 ^ xor2));
    }
    public static void main(String[] args) {
        int main[] = { 0, 1, 2, 3, 4, 5 };
        int arr[] = { 0, 1, 2, 3, 5 };
        findmissing(main, arr);
    }
}


