public class recursion{
   public static void printnum(int i,int n,int sum){
       if(n==i){
        sum =sum+n;
        System.out.println(sum);
        return;
       }
       sum =sum+i;
        printnum(i+1, n, sum);
        System.out.println(i);
      
    }
    public static void main(String[] args) {
       printnum(0, 5, 0);
    }
}