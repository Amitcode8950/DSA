package Math;

public class prime {
   public static void main(String[] args) {
       int num =5;
       if(num == 1){
           System.out.println("not prime");
       }
     // to check prime number we only need to check upto sqrt(n)
     // square root only checks divisibility
     for(int i =2; i*i<num; i++){
        if(num%i == 0){
            System.out.println("not prime");
            break;
        }else{
            System.out.println("prime");
        }
     }
   } 
}
