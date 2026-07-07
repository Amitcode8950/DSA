public class noofoccur {
     static int getlowerbound(int [] arr, int target){
       int n = arr.length;
       int s =0;
       int e = n -1;
       int ans =n;

       while (s<=e) {
         int mid =s +(e-s)/2;
         if(arr[mid]>=target){
            ans =mid;
            e =mid-1;
         }else{
            s=mid+1;
         }
       }

        return ans ;
    }
    static int upperbound(int[] arr , int target){
        int n = arr.length;
     int s=0;
     int e =n-1; 
     int mid =0;
     int ans =n;
     while(s<=e){
        mid =s+(e-s)/2;
        if(arr[mid]>target){
            ans=mid;
           e=mid-1;
        }
        else{
           s=mid+1;
        }
     } 
     return ans;  
    }
    static int nooccur(int [] arr, int target){

   int upper=upperbound(arr, target);
   int lower= getlowerbound(arr, target);
   int occur = upper-lower;
   return occur;

        
    }
    public static void main(String[] args) {
        int [] arr ={1,1,2,2,2,2,3};
        int target =2;
        System.out.println(nooccur(arr, target));
    }
}
