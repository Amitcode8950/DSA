import java.util.Arrays;

public class insertionsort {
    static void insertion(int[] arr){
        int n = arr.length; 
       for(int i =1; i<n; i++){
        int currnt =i;
        int currentvalue= arr[i];
        int pre=i-1;
         while(pre>=0 && currentvalue <arr[pre]){
          arr[pre+1] =arr[pre];
          pre--;
         }
         arr[pre+1]=currentvalue;
       }

        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int [] arr= {6, 4, 5, 1, 3};
        insertion(arr);
    }
}
