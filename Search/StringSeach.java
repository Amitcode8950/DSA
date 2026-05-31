public class StringSeach {

    public static void main(String[] args) {
        String [] arr = {"Apple","Banana","Cherry","Date","Fig","Grape"};
        String target = "jate";
        System.out.println(seach(arr,target));
    }
    static boolean seach(String [] arr,String target){
        if(arr.length == 0){
            return false;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                return true; // return the index where target is found
            }
        }
        // element not found
        return false;
    }
}