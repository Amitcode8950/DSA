package countone;
public class maxonerow {
    static void maxonein2D(int[][] arr){
        int n =arr.length;
        int m = arr[0].length;
        int zero=0;
        int max=0;
        int row =0;
      for(int i=0; i<n;i++){
        for(int j=0; j<m;j++){
           if(arr[i][j]==1){
            zero++;
           }
        }
        if(max<zero){
            max=zero;
            row=i;
        }
       
        zero=0;
        
      }
       System.out.println(max + " "+row);
    }
    public static void main(String[] args) {
        int[][] arr={
            {0,0,0,0,1,1},
            {0,0,1,1,1,1},
            {0,0,0,0,0,1},
            {0,1,1,1,1,1},
            {0,0,0,1,1,1},
        };
        maxonein2D(arr);
    }
}
