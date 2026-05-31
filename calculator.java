
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter operter here :- ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("enter the num1: - ");
                int num1 = in.nextInt();
                System.out.print("Enter the num2: -");
                int num2 = in.nextInt();
                if (op == '+') {
                    sum = num1 + num2;
                }
                if (op == '-') {
                    sum = num1 - num2;
                }
                if (op == '*') {
                    sum = num1 * num2;
                }
                if (op == '/') {

                    if (num2 != 0) {
                        sum = num1 / num2;
                    }
                }
                if (op == '%') {
                    sum = num1 % num2;
                } 
            }
            else if(op == 'x'|| op =='X'){
                break;
                
            }
            else{
                System.out.println("invaild opeartion");
            }
            
            
            System.out.println("OUTPUT OF 2 number is : "+sum);
        }
    }
}
