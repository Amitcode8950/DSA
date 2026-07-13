public class search{
   static boolean seackmatrix(int[][] arr, int target){
     int totalrow =arr.length;
     int totalcol=arr[0].length;
     int n =totalcol*totalrow;
     int s =0;
     int e= n-1;
     while(s<=e){
      int mid = s+(e-s)/2;
      int rowindex =mid/totalcol;
      int colindex=mid%totalcol;
      if(arr[rowindex][colindex]==target){
         return true;
      }else if(arr[rowindex][colindex] > target){
         e=mid-1;
      }else{
         s=mid+1;
      }
     }
return false;
    
   }
   public static void main(String[] args) {
     int[][] arr={
      {1,3,5,7},
      {10,11,16,20},
      {23,30,34,60},
     };

     int target=3;
     boolean ans=seackmatrix(arr, target);
     System.out.println(ans);
      
   }
}