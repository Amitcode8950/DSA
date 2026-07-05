public class rouatye90deg {
    static void transpos(int[][] arr ,int n){ 
       for(int i =0; i<n;i++){
        for(int j =i+1; j<n ;j++){
            int  temp =arr[i][j];
            arr[i][j]= arr[j][i];
            arr[j][i]=temp;
        }
       }
       for(int row=0; row<n;row++){
        int startcol=0;
        int endcol=n-1;
        
        while (startcol <=endcol) {
            int temp = arr[row][startcol];
          
            arr[row][startcol] = arr[row][endcol];
            arr[row][endcol] = temp;
            startcol++;
            endcol--;
        }
       }
        }

    public static void main(String[] args) {
        
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n =arr.length;
        transpos(arr, n);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    

    }
}
