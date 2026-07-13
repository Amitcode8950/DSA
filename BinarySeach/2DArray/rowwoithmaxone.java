public class rowwoithmaxone {
    static int row(int[][] arr, int rowIndex) {
        int totalrow = arr.length;
        int totalcol = arr[0].length;
        int target = 1;
        int ans = -1;
        if (arr[rowIndex][totalcol - 1] == 0) {
            return totalcol;
        } else {
            int s = 0;
            int e = totalcol - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[rowIndex][mid] == 0) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                    ans = mid;
                }
            }
        }

        return ans;
    }
    public int rowwithaxone(int[][] arr){
        int totalrow = arr.length;
        int totalcol =arr[0].length;
        int maxonewakirowindex=-1;
        int maxi= -1;
        for(int row =1; row<totalrow; row++){
            int firstaccindex = row(arr, row);
            int onecount = totalcol -firstaccindex;
            if(onecount!=0 &&onecount >maxi){
              maxi=onecount;
              maxonewakirowindex=row;
            }
            
        }
        return maxonewakirowindex;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0, 0, 1 },
                {0, 0, 1, 1, 1 },
                {0, 0, 0, 1, 1 },
                {0, 0, 0, 0, 0 }
        };
      rowwoithmaxone m = new rowwoithmaxone();
        System.out.println(m.rowwithaxone(arr));
      
        
    }
}
