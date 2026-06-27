
public class arrayintersection {
    static void common(int[] arr1, int[] arr2){
        
        for(int i=0; i<arr1.length;i++){
            for(int j = 1; j<arr2.length; j++){
               
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+ " " +arr2[j]);
                }
            }
           
        }
    }
    public static void main(String[] args) {
        int [] arr2= {10,20,30,40,5,6};
        int [] arr1={1,2,3,5,6};
        common(arr1, arr2);
    }
}
