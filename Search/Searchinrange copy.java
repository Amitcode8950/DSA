public class Searchinrange {

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,10,11,12,13};
        int target = 10;
       if(range(arr, target, 0, 7) == -1){
        System.out.println("target not found in range");
       }else{
        System.out.println("target found in range");
       }
    }
    static int range(int[] arr, int target, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i; // target found, return its index
            }
        }
        return -1; // target not found in range
    }
}