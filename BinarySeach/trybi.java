public class trybi {
     
      static int tryswlf(int[] arr, int target){
       int n =arr.length;
       int start = 0;
       int end = n-1;

       int mid = start+(end-start/2);
       while (start <=end) {
        if(target ==arr[mid]){
            return mid;
        }else if(arr[mid] > target){
            end =mid -1;
        }else{
            start =mid +1;
        }
        mid = start + (end - start) / 2;
       }


        return -1;
      }
      public static void main(String[] args) {
        int [] arr={10,11,13,17,18,19,21,27,37,40,45,49,50};
        int target = 49;
        System.out.println(tryswlf(arr, target));
      }
}
