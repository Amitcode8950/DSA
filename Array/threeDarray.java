package Array;
import java.util.Arrays;
import java.util.Scanner;

public class threeDarray {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int arr[][][]=new int[3][3][3];
        for(int i =0 ; i<arr.length ; i++){
            for(int j =0; j<arr[i].length ; j++){
                for(int k=0;k<arr[i][j].length;k++){
                    arr[i][j][k]=in.nextInt();
                }
                System.out.println();
                
            }
            System.out.println();
            
        }
        for(int i =0 ; i<arr.length ; i++){
            for(int j =0; j<arr[i].length ; j++){
               for(int k=0;k<arr[i][j].length;k++){
                System.out.print(arr[i][j][k]+" ");
               }
               System.out.println();
            }
            System.out.println();
        }
    }
}