import java.util.Scanner;

public class empoly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you EmpID : ");
        int empID =in.nextInt();
        System.out.print("Enter your department : ");
        String department = in.next();

        switch(empID){
            case 1:
                System.out.println("Amit kumar");
                break;
            case 2:
                System.out.println("Anjali singh");
                break;
            case 3:
                switch(department){
                    case "IT" :
                        System.out.println("IT Department");
                        break;
                    case "Manager":
                        System.out.println("Manager Department");
                        break;
                    default:
                        System.out.println("no department");
                        break;
                }
                break;
            default :
            System.out.println("enter correct empID or department");
            }
            
    
    }
} 
