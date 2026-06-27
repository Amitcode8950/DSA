public class maxelement {
    // static void max(int[] arr){
    //     int max =0;
    //     for(int i =0;i< arr.length; i++){
    //         if(max < arr[i]){
    //             max =arr[i];
    //         }
    //     }
    //     System.out.println(max);
    // }
    static void max(int[] arr){
        int max =arr[0];
         for(int i =0;i< arr.length; i++){
            max=Math.max(max, arr[i]);
        }
        System.out.println(max);
        
    }
    public static void main(String[] args) {
        int [] arr={4,7,48,5,90};
        max(arr);
    }
}
