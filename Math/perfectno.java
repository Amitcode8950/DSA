package Math;

public class perfectno {
    public static void main(String[] args) {
        int num=77;
        int sum=0;
        for(int i =1; i*i<num; i++){
           if(num %i == 0){
            sum =sum+i;
           }
           if(num %i == 0 && i*i !=num ){
            sum =sum+i;
           }
        }
        if(sum==num){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a Perfect number");
        }
    }
}
