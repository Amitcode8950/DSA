public class Searchinrange {

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,10,11,12,13};
        int target = 10;
        System.out.println(range(arr, target, 5, 7));
    }
    static boolean range(int[] arr, int target, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return true; // target found in range
            }
        }
        return false; // target not found in range
    }
}