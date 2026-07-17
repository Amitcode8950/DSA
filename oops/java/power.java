public class power {
    public static int powerset(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpower1 = powerset(x, n - 1);
        int power = x * xpower1;
        return power;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans=powerset(x, n);
        System.out.println(ans);

    }
}
