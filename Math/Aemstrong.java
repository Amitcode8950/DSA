package Math;

public class Aemstrong {
    public static void main(String[] args) {
        int num=153;
        int originalnum=num;
        int sum=0;
        while(num!=0){
            int n = num%10;
           num= num/10;
           sum = sum+(int)Math.pow(n,3);

        }
        if(sum==originalnum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }
}
