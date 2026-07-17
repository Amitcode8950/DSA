import java.util.ArrayList;
import java.util.List;

public class sprialprint {
    static List<Integer> sperial(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> result = new ArrayList<>();
        int startrow = 0;
        int endingrow = m - 1;
        int startingcol = 0;
        int endingcol = n - 1;

        while (startingcol <= endingcol && startrow <= endingrow) {
            for (int i = startingcol; i <= endingcol; i++) {
                result.add(arr[startrow][i]);

            }
            startrow++;
            for (int j = startrow; j <= endingrow; j++) {
                result.add(arr[j][endingcol]);
            }
            endingcol--;
            if (startrow <= endingrow) {
                for (int col = endingcol; col >= startingcol; col--) {
                    result.add(arr[endingrow][col]);
                }
                endingrow--;
            }
            if (startingcol <= endingcol) {
                for (int row = endingrow; row >= startrow; row--) {
                    result.add(arr[row][startingcol]);
                }
                startingcol++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        List<Integer> ans = sperial(arr);
        for (int k : ans) {
            System.out.print(k + " ");
        }
    }
}
