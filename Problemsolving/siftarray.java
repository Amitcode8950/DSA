public class siftarray {
    static void arraysift(int[] arr){
        int n =arr.length;
        int [] copyarray= new int[n];
        for(int i = 0; i<arr.length; i++){
          int a =arr[i];
          copyarray[i+1] =a;
        }
        for(int r: copyarray){
            System.out.println(r);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        arraysift(arr);
        }
}
