public class reverstring {
    public static void reverofstring(String name,int idx){
        if(idx==0){
            System.out.println(name.charAt(idx));
            return;
        }
       System.out.println(name.charAt(idx));
       reverofstring(name, idx-1);
       
    }
    public static void main(String[] args) {
        String name ="abcd";
        reverofstring(name,name.length()-1);
    }
}
