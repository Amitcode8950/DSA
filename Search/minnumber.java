public class minnumber {

    public static void main(String[] args) {
        int[] arr= {4,5,6,2,8,9,5,54,5,8,5,8};
        int min= arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}