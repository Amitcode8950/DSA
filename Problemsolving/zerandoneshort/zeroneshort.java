package zerandoneshort;
import java.util.Arrays;
public class zeroneshort {

    static void sort(int [] arr){
        
        int zero =0;
        int one =0;
        for(int i=0; i<arr.length; i++){
           if(arr[i]==0){
                
                zero++;
            }
            else{
                arr[one]=1;
                one++;
            }
        }
        int [] newarr = new int[arr.length];
        for(int i =0; i<newarr.length; i++){
            for(int j =0; j<zero; j++){
                newarr[i]=0;
                i++;
            }
            for(int k =0; k<one; k++){
                newarr[i]=1;
                i++;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1,0,1,0,1};
        sort(arr);
       

    }
}
