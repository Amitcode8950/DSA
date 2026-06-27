public class unsortonelem {
    static void unsorted(int[] arr){
       for(int i =0; i<arr.length-1; i++){
        if(arr[i+1] >=arr[i]){
           
        }
        else{
        System.out.println(arr[i+1]);
        }
       }
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,5,9,10,13,2};
        unsorted(arr);
    }
}
