package funcation;
import java.util.Scanner;

public class func {
//     static void sum() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter the 1st number : ");
//         int a = in.nextInt();
//         System.out.print("Enter the 1st number : ");
//         int b = in.nextInt();
//         int c = a + b;
//         System.out.println("The Sum : " + c);
//     }

//     public static void main(String[] args) {
//         sum();

//     }

    public static void main(String[] args) {
        int sum = sum2();
        System.out.println(sum);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you 1st number : ");
        int s = in.nextInt();
        System.out.print("Enter you 2st number : ");
        int p = in.nextInt();
        int num = s + p;
        return num;
    }
}

// public static void main(String[] args) {
//     Scanner g = new Scanner(System.in);
//     int h = g.nextInt();
//     int i = g.nextInt();
//     int sum = greet(h, i);
//     System.out.println(sum);
// }

// static int greet(int a, int b) {
//     int sum = a + b;
//     return sum;

// }