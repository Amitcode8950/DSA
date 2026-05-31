package Math;

public class palindrome {
    public static void main(String[] args) {
         
        int num = 12321;
        
         int rever=0;
         int original = num;
        while(num !=0){
            int n = num%10;
           num= num/10;
           rever = rever*10;
           rever =rever+n;

        }
       if(original==rever){
        System.out.println("number is palindrome");
       }else{
        System.out.println("number is not palindrome");
       }
    }
}
