
public class unique {
    static void uniqe(int [] arr){
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int [] arr ={1,2,1,3,3,4,4,5,5};
        uniqe(arr);
    }
}
