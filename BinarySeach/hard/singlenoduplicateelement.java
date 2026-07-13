public class singlenoduplicateelement {
    static int nonduplicate(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            if(s==e){
                return arr[mid];
            }
            int currentvalue=arr[mid];
            int prevalue=-1;
            if(mid-1>0){
                prevalue =arr[mid-1];
            }
            int nextvalue = -1;
            if(mid+1<n){
                nextvalue = arr[mid+1];
            }
            if(currentvalue!=prevalue && currentvalue!=nextvalue){
                return currentvalue;
            }
            if(prevalue!=currentvalue && nextvalue ==currentvalue){
                int startingIndexofpair=mid;
                if((startingIndexofpair & 1)==1){
                  e=mid-1;
                }else{
                  s=mid+1;
                }
            }else if(currentvalue ==prevalue && currentvalue != nextvalue){
                  int endingIndexofpair = mid-1;
                  if((endingIndexofpair & 1)==1){
                    e=mid+1;
                  }else{
                    s=mid-1;
                  }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4,8,8};
        System.out.println(nonduplicate(arr));
    }
    
}
