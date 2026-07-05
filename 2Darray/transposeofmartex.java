import java.util.ArrayList;
import java.util.List;

public class transposeofmartex {
    static int[][] transpose(int[][] arr){
       if(arr ==null|| arr.length==0){
        return new int[0][0];
       }
       int totalrow=arr.length;
       int totalcol=arr[0].length;

       int ansrow=totalcol;
       int anscol =totalrow;
       int ans[][]= new int[ansrow][anscol];
         for(int i=0; i<totalrow; i++){
            for(int j =0; j<totalcol; j++){
              ans[j][i]= arr[i][j];
            }
         }

       return ans;
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] ans1=transpose(arr);
        for(int i=0;i<ans1.length; i++){
            for(int j=0; j<ans1[i].length; j++ ){
                System.out.print(ans1[i][j]);
            }
          System.out.println();
        }
        
    }
    
}
