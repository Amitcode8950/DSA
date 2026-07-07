public class pivotindexrotatedarray {

    static void indexrotated(int[] arr, int target) {
        int n = arr.length;
        if (n == 0) {
            System.out.println("not find");
            return;
        }

        int s = 0;
        int e = n - 1;
        int piv = -1;

        if (arr[s] < arr[e]) {
            System.out.println("not a roatated array");
        } else {
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (mid < e && arr[mid] > arr[mid + 1]) {
                    piv = mid;
                    break;
                }
                if (mid > s && arr[mid] < arr[mid - 1]) {
                    piv = mid - 1;
                    break;
                }
                if (arr[mid] >= arr[s]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        int low, high;
        if (piv == -1) {
            // Not rotated, search the entire array
            low = 0;
            high = n - 1;
        } else {
            // Rotated, choose the correct half to search
            if (target >= arr[0] && target <= arr[piv]) {
                low = 0;
                high = piv;
            } else {
                low = piv + 1;
                high = n - 1;
            }
        }

        s = low;
        e = high;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println("not find");
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 1;
        indexrotated(arr, target);
    }
}

