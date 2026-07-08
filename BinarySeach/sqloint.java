public class sqloint {

    static double find(int n) {
        if (n == 1) {
            return 1;
        }
        int s = 1;
        int e = n;
        int mid = -1;
        double ans = -1;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (mid == n / mid) {
                return mid;
            } else if (mid > n / mid) {

                e = mid - 1;

            } else {
                s = mid + 1;
                ans = mid;

            }
            double factor = 1;
            int totalprescion = 2;
            for (int round = 1; round <= totalprescion; round++) {
                factor =factor/10;
            for(int i =0; i<=10; i++){

            
                double newAns = ans + factor;

                if (newAns * newAns <= n) {
                    ans = newAns;
                } else {
                    break;
                }
            }
            }
            
        }
        return (Math.round(ans * 1000.0) / 1000.0);
    }

    public static void main(String[] args) {
        int n = 56;
        System.out.println(find(n));
    }

}
