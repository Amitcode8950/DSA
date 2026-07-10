import java.util.Arrays;

public class Aggressivecowwsproblem {
    static boolean isvaild(int arr[],int k, int mid){
        int cowcount =1;
        int lastpodtion =0;

        for(int i=0 ; i<arr.length; i++){
            if(arr[i]- arr[lastpodtion]>=mid){

                cowcount++;
                lastpodtion=i;
                if(cowcount ==k){
                    return true;
                }

            }
        }

      return false;
    }
     static int cowsprobelem(int arr[],int k){
        Arrays.sort(arr);
        int n =arr.length;
        int s =0;
        int ans =-1;
        int e =arr[n-1]-arr[1];
        while(s<=e){
            int mid =s+(e-s)/2;
            if(isvaild(arr,k ,mid)){
                ans =mid;
                s= mid +1;
     
            }else{
                e =mid-1;
            }
        }

        return ans;
     }

    public static void main(String[] args) {
        int arr[]={1,2,8,4,9};
        int k =3;
        System.out.println(cowsprobelem(arr, k));
    }
}
