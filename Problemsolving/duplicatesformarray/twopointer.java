import java.util.Arrays;

public class twopointer {
    static void twoponiter(int[] arr) {
        for(int f: arr){
            System.out.println(f);
        }
        System.out.println("new");
        int n = arr.length;
        int i =0;
        int j = i+1;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                i++;
                arr[i] =arr[j];
                j++;
            }
            
        }
        for(int k :arr){
            System.out.println(k);
        }
       
        

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 3, 4 };
        
       twoponiter(arr);
    }
}
