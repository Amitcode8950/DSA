public class painterpartition {

    static boolean isvaildsolution(int arr[], int k, int maxlenght){
       int painterCount =1;
       int paintedlenght=0;
       for(int i=0; i<arr.length; i++){
         if(paintedlenght+arr[i] <maxlenght){
            paintedlenght =paintedlenght +arr[i];
         }else{
            painterCount++;
            paintedlenght=0;
            if(painterCount >k && arr[i] >maxlenght){
                return false;
            }
            else{
                paintedlenght =paintedlenght+arr[i];
             }
         }
       }


        return true;
    }
    static int mintime(int arr[], int k){
        int sum =0;
        for(int i =0; i< arr.length; i++){
            sum =sum +arr[i];
        }
        int ans=-1;
        int s =0;
        int e =sum;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isvaildsolution(arr,k,mid)){
                ans =mid;
                e=mid-1;

            }else{
                s=mid+1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int k = 2;
        System.out.println(mintime(arr, k));
    }
}
