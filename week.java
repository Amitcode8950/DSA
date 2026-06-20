import java.util.Scanner;

public class week {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you day : ");
        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Working Day");
                break;
            case 6, 7:
                System.out.println("Off day");
                break;
            default:
                System.out.println("not a day enter a good number between 1 to 7");
        }
    }
}