public class factraul {
    public static int factrualcal(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = factrualcal(n - 1);
        int factn = n * fact;
        return factn;

    }

    public static void main(String[] args) {

        int result = factrualcal(5);
        System.out.println("Factorial of 5: " + result);

    }
}
