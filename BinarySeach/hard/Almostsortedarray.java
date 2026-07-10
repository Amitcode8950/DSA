public class Almostsortedarray {
    static int mind(int arr[],int m){
        int n =arr.length;
        int s =0;
        int e =n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==m){
                return mid;
            }
            if(mid-1>=0 && arr[mid-1]==m){
                return mid -1;
            }
            if(mid+1<n && arr[mid+1]==m){
                return mid+1;
            }
            if(m > arr[mid]){
                s=mid+2;
            }else{
                e=mid-2;
            }
        }


        return -1;
    }
    

    public static void main(String[] args) {
        int arr[]={10,30,20,50,40,70,60,80};
        int m =30;
        System.out.println(mind(arr,m));
    }
}
  