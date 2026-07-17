public class towerofhanoi {
    public static void towerofHanoi(int n,String src, String helper, String dest){
     if(n==1){
        System.out.println("trasfer of dish " + n + " form " + src + " to " + dest);
        return;
     }
        towerofHanoi(n-1, src, dest, helper);
        System.out.println("trasfer of dish "+n+" form " +src+" to "+dest);
        towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n =2;
    towerofHanoi(n,"S", "H", "D");
    }
}
