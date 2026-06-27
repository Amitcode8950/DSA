public class postiveneg {
    static void postneg(int[] arr){
        int postive =0;
        int neg =0;
      for(int i=0;i<arr.length;i++){
        if(arr[i] >=0){
            postive = postive+ arr[i];
        }
        else{
            neg = neg+arr[i];
        }
      }
      System.out.println(postive);
      System.out.println(neg);
    }
    public static void main(String[] args) {
        int [] arr={4,5,6,-1,-10,-4,10};
        postneg(arr);
    }
}
