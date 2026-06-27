public class zeroandonecount {
    static void count(int[] arr){
        int one =0;
        int zero =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == 1){
                one++;
            }
            else{
                zero++;
            }
        }
        
        System.out.println(one);
        System.out.println(zero);
    }
    public static void main(String[] args) {
        int[] arr= {1,0,1,0,1,0,1,0,1,0,1,0,1};
        count(arr);
    }
}
