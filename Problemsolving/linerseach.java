public class linerseach {
    static void findelement(int[] arr,int target){
        for(int i=0; i<arr.length;i++){
            if(arr[i]== target){
                System.out.println("find the digit "+ i + " At the "+ arr[i]);
            }
            
        }
        
    
    };
    public static void main(String[] args) {
        int [] arr={4,40,50,90,8,90};
       findelement(arr,90);
    }
}
