import java.util.Arrays;
import java.util.Scanner;
public class siftarray {

    static void sift(int [] arr){
      int n =arr.length;
      int temp =arr[n-1];
      for(int i=n-1; i>0; i--){
        arr[i]= arr[i-1];
      }
      arr[0]=temp;
      System.out.println(Arrays.toString(arr));
    }
    
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        
      int [] arr = new int[5];
      for(int i=0; i<arr.length; i++){
        arr[i]=in.nextInt();
      }
      sift(arr);
    }
}