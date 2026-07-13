public class sortedboth {
    
    static boolean searchMatrix(int [][] arr, int target){
       int totalrow= arr.length;
       int totalcol = arr[0].length;
       int row= 0;
       int col =totalcol-1;
       while(row <totalcol && col>=0){
        if(arr[row][col]==target){
            return true;                             // time complexity =O(m+n)
        }else if(arr[row][col]>target){
          col--;
        }else{
            row++;
        }
       }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,26},
            {18,20,21,23,30},
        };

        int target=14;
        boolean ans=searchMatrix(arr, target);
        System.out.println(ans);
        
    }

    
}
