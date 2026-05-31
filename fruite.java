import java.util.Scanner;

public class fruite {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your fruite : ");
        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println(fruit+" weekings os fruit");
                break;
            case "Apple":
                System.out.println(fruit+" Sweet Red fruit");
                break;
            case "Banana":
                System.out.println(fruit+" Sweet yellow fruit");
                break;
            default:
                System.out.println("only Fruit");

        }
    }
}