public class pivotindex {
    
   static int pivotindex(int [] arr){
     int n = arr.length;
     int s =0;
     int e =n-1;
     int mid =-1;
     int ans =-1;
     if(arr[s]< arr[e]){
        return -1;
     }else{
         while (s<=e) {
            mid=s+ (e-s)/2;
            if(arr[mid]>arr[e]){
                e=mid+1;
            }else{
                ans =mid;
                s=mid+1;
            }
         }
         return ans;
     }
   }
    public static void main(String[] args) {
        int [] arr ={4,5,6,7,0,1,2};
        System.out.println(pivotindex(arr));
        
    }
}
