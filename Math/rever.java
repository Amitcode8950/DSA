package Math;

public class rever {
    public static void main(String[] args) {
         int sum=0;
        int num = 8456;
        while(num !=0){
            int n = num%10;
           num= num/10;
           sum = sum*10;
           sum =sum+n;

        }
        System.out.println(sum);
    }
}
