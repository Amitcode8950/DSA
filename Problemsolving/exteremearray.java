
public class exteremearray {
    static int[] ramdo(int[] arr){
      int n =arr.length;
      int i =0;
      int j =n-1;
      int[] newarray= new int[n];
      int k=newarray.length;
      int ri=0;
      int rj=k-1;


     while(i<=j){
         int temp = arr[i];
         int a = arr[j];
         newarray[ri] =a;
         newarray[rj] =temp;
         
         i++;
         j--;
         ri++;
         rj--;
         
        }
       
      }
      
       
     
    

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        ramdo(arr);
        
       
    }
}