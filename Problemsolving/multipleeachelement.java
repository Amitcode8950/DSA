public class multipleeachelement {
    static int[] arram(int[] arr){
        int lenght = arr.length;
        int [] newarray= new int[lenght];
     for(int i=0; i<lenght; i++){
        int element = arr[i];
        int operation = element *10;
        newarray[i] = operation;
     }
     return newarray;
     
    }
    public static void main(String[] args) {
        int[] arr={2,5,6,7};
        int ans[] =arram(arr);
        for(int i :ans){
            System.out.println(i);
        }
    }
}
