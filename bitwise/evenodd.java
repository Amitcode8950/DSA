public class evenodd {
    public static void main(String[] args) {
        // cheack even or odd
        int n = 5;
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        // multiply by 2
        int a = 5;
        System.out.println(a << 1);
        // devide by 2
        int b = 10;
        System.out.println(b >> 1);
        // check power of i
        // set countbit how may bit in the number
        int count = 0;
        while (a != 0) {
            if ((a & 1) == 1) {
                count++;
            }
            a = a >> 1;
        }
        System.out.println(count);

        // n&(n-1) ==0 --> power of 2 // n or n-1 or --> 0
        int m = 10;
        if ((m & (m - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a power of 2");
        }
        //swip two number by xor
        int x=5;
        int y =6;
        System.out.println("Before Swip");
        System.out.println(x);
        System.out.println(y);
        x= x^y;
        y=x^y;
        x=x^y;
        System.out.println("After Swip");
        System.out.println(x);
        System.out.println(y);
        //unique number in array
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int unique = 0;
        for(int i=0;i<arr.length;i++){
            unique = unique^arr[i];
        }
        System.out.println(unique);
    }
}
