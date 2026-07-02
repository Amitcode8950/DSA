
public class sum {
    static void findsum(int[] arr, int target){
        int n =arr.length;
        for(int i=0; i<n-1; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("The pair is: "+arr[i]+" and "+arr[j]);
                }
            }
        }

    }
public static void main(String[] args) {
    int [] arr = {-1,-2,-3,-4,-5};
    int target =-8;
    findsum(arr, target);
}
    
}