public class linerSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=2;
        // seach in the arrays return the index if item found 
        //otherwise item not find return -1
        if(linearSearch(arr,target)== -1){
            System.out.println(false);
        }else{
             System.out.println(true);
        }
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i; // return the index where target is found
            }
        }
        // element not found
        return -1;
    }
}
