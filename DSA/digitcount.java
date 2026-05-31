public class digitcount {

    public static void main(String[] args) {
       int [] nums = {12,345,2,6,7896};
       //System.out.println(findNumber(nums));
       System.out.println(digits(0));
       // System.out.println(digits2(55555));
    }
    // static int digits2(int num){    //basce we to find the number od digit
    //     return (int)(Math.log10(num)) +1;
    // }
    static int findNumber(int[] nums){
     
        int count =0;
      for(int num :nums){
        if(even(num)){
            count++;
        }
      }

        return count;
    }
    static boolean even(int num){
       int numberofdigit = digits(num);
       if(numberofdigit%2==0){
        return true;
       }
        return false;
    }
    static int digits(int num){
        if(num < 0){
            num = -num;
        }
        if(num == 0){
            return 1;
        }
        int count =0;
        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }
   
}