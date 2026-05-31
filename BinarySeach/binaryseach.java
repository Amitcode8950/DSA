public class binaryseach {
    public static void main(String[] args) {
        int[] arr ={-18,-12,-4,18,22,45,89};
        int target =22;
        int find=binarySeach(arr,target );
        System.out.println(find);
        
    }
    static int binarySeach(int[] arr, int target){
        int start =0;
        int end = arr.length -1 ;
        System.out.println(end);
        while (start <=end){
            //int mid = start+end/2;  minght be possible excend that in java
            int mid =start +(end-start)/2;
            if(target < arr[mid]){
                end =mid-1;
            }else if(target > arr[mid]){
                start= mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
