package Array;
import java.util.Arrays;
import java.util.Scanner;

public class twoDarray {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //taking input
        for(int i =0 ; i<arr.length ; i++){
            for(int j =0; j<arr[i].length ; j++){
                arr[i][j]=in.nextInt();
            }
            System.out.println();
            
        }
        //taking output
        for(int i =0 ; i<arr.length ; i++){
            for(int j =0; j<arr[i].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // output in differ way
        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }
        /// change in the vale 
        arr[1][2] =1000;
    }
}