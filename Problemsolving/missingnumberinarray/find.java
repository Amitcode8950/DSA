public class find {
    static void findmissing(int [] main, int [] arr){
        int arr1sum = 0;
        int arrsum = 0;
        for (int i : main) {
            arr1sum += i;
        }
        for (int i : arr) {
            arrsum += i;
        }
        System.out.println("Missing number is: " + (arr1sum - arrsum));
    }
  public static void main(String[] args) {
    int main[]= { 0,1,2,3,4,5 };
    int arr[] = { 0,1,2,3,5 };
    findmissing(main, arr);

   
  }
    
}