public class repled {
    
    static void find(int [] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println("The duplicate element is: "+arr[i]);
                    break; // Exit the inner loop after finding the first duplicate for this element
                }
                 // Exit the outer loop after finding the first duplicate
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 30, 60, 40 };
        find(arr);
    }
}
