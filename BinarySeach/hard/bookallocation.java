public class bookallocation{
    static boolean isVaildAnswer(int[] arr, int k, int maxpages){
     int studentcount =1;
     int page=0;
     for(int i =0; i<arr.length; i++){
        if(page +arr[i]<=maxpages){
            page =page+arr[i];
        }else{
            studentcount++;
            if(studentcount >k && arr[i] > maxpages){
                return false;
            }else{
                page=0;
                page =page +arr[i];
            }
            
        }
     }
     return true;
    }
    
  static int findpage(int[] arr, int k){

    if(arr.length <k){
        return -1;
    }
    int n =arr.length;
    int s =1;
    int sum =0;
    for(int i=0; i<n;i++){
        sum = sum +arr[i];
    }
    int ans =-1;
    int e =sum;

    while(s<=e){
    int mid= s+(e-s)/2;

    if(isVaildAnswer(arr,k,mid)){
        ans =mid;

    e=mid-1;
    }
    else{
       s= mid+1;
    }
    }


    return ans;

  }
    public static void main(String[] args) {
        int[] arr={12,34,67,90};
        int k =2;
       System.out.println(findpage(arr, k));
    }
}