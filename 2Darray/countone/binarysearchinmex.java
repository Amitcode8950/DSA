import java.util.*;;

public class binarysearchinmex {

    static int getfirstindex(int[][] arr, int rowIndex) {
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int target = 1;
        int s = 0;
        int e = totalcol - 1;
        int ans = -1;
        // handing 1 one not indie the row
        if (arr[rowIndex][totalcol - 1] == 0) {
            return totalcol;
        } else {
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[rowIndex][mid] == 0) {
                    s = mid + 1;
                } else {
                    ans = mid;
                    e = mid - 1;
                }
            }
        }

        return ans;
    }

    static int[] moreone(int[][] arr) {
        int[] ans = new int[2];
        int max = 0;
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int rowindex = -1;
        for (int row = 0; row < totalrow; row++) {
            int firstocc = getfirstindex(arr, row);
            int count = totalcol - firstocc;
            
            if (count !=0 &&count > max) {
                max = count;
                rowindex = row;
            }
        }
        ans[0] = rowindex;
        ans[1] = max;
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 0, 0, 1, 1 },
                { 0, 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 1 },
                { 0, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 1, 1, 1 },
        };
        System.out.println("row index"+ "  no of count");
        System.out.println(Arrays.toString(moreone(arr)));
    }
}
