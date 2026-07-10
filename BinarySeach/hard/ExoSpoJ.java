public class ExoSpoJ {
static boolean vaildans(int[] arr, int m, int mid){
    long woodcollected=0;
    for(int i =0; i<arr.length; i++){
        if(arr[i]>mid){
            long currentreewoodcollection=arr[i]-mid;
            woodcollected=currentreewoodcollection+woodcollected;
        }
    }
    if(woodcollected>=m){
        return true;
    }
    else {
        return false;
    }
  

  
}

    static int tree(int arr[], int m) {
        int n = arr.length;
        int ans = -1;
        int s = 0;
        int e = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > e) {
                e = arr[i];
            }
        }
        while(s<=e){
           int mid =s+(e-s)/2;
           if(vaildans(arr, m,mid)){
            ans =mid;
            s=mid+1;
           }else{
            e=mid-1;
           }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[]={20,11,10,17};
        int m =7;
        System.out.println(tree(arr, m));

    }
}
