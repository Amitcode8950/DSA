package Math;

public class gcd {
    public static void main(String[] args) {
        System.out.println(gcd(12,18));
        System.out.println(getlcm(12,18));
    }
    //gcd find greatest common divisor
    static int gcd(int a, int b ){
        // gcd(a,b) = gcd(b,a%b)
        // base case when b = 0 then gcd is a
        while(b!=0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    //lcm find least common multiple
    static int getlcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
