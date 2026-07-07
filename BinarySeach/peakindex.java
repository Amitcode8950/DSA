public class peakindex {
    static int peckindex(int [] arr){
        int n =arr.length;
        int s=0;
        int e =n-1;
        int ans =-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]< arr[mid+1]){
                s=mid+1;
            }else{
               ans =mid;
               e=mid-1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr={0,2,5,3,1};
        System.out.println(peckindex(arr));
    }
}