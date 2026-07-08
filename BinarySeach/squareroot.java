public class squareroot {
    static int find(int n) {
        if (n == 1) {
            return 1;
        }
        int s = 1;
        int e = n;
        int mid = -1;
        int ans = -1;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (mid  == n/mid) {
                return mid;
            } else if (mid  > n/mid) {

                e = mid - 1;
                
            } else {
                s = mid + 1;
                ans = mid;

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 56;
        System.out.println(find(n));
    }
}