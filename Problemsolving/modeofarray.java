import java.util.HashMap;

public class modeofarray {
    static void mod(int [] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);  
        }
        int maxvalue=-1;
        int maxkey=-1;
        for(int i : freq.keySet()){
           
            if(freq.get(i) > maxvalue){
                maxvalue = freq.get(i);
                maxkey = i;
            }
        }
        System.out.println("Mode: " + maxkey + " Frequency: " + maxvalue);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,5,5};
        mod(arr);
    }
}
