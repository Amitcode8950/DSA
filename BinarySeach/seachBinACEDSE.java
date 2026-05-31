public class seachBinACEDSE {
    public static void main(String[] args) {
        int[] arr = {89,88,87,86,45,23,22,17,12,0,-2};
        int target = 22;
        int find = binarySeach(arr, target);
        System.out.println(find);

    }

    static int binarySeach(int[] arr, int target){
        int start =0;
        int end = arr.length -1 ;
        boolean isAce = arr[start] <arr [end];

        while (start <=end){
            //int mid = start+end/2;  minght be possible excend that in java
            int mid =start +(end-start)/2;
            if(arr[mid] ==  target){
                return mid;
            }
           if(isAce){
             if(target < arr[mid]){
                end =mid-1;
            }else{
                start= mid +1;
            }
        }
            else{
                 if(target > arr[mid]){
                end =mid-1;
            }else{
                start= mid +1;
            }
            }
           
        }
        return -1;
    }
}