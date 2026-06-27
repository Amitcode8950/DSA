
public class averagesum {

    static double getavaerage(int[] arr){
        int sum = 0;
    for(int i:arr){
      sum+=i;
    }
    int size = arr.length;
    double avg= (double)sum/size;
    return avg;
    }
    public static void main(String[] args) {
    //     int A=0;
        
    //     int []arr = {1,2,4,5,6,7,8,9,10,11};
    //     int n =0;
    //     for(int i=0;i<arr.length;i++){
    //         A= A+arr[i];
           
    //         n++;
    //     }
    //      double average =A/n; 
    //    System.out.println(average);

    int[] arr= {2,4,1,3};
    System.out.println(getavaerage(arr));
        
    }
}
