public class charSeach {

    public static void main(String[] args) {
        String name = "effffrfrfrfrwffff";
        char target = 'r';
        System.out.println(seach(name, target));
    }
    static boolean seach(String name, char target){
        if(name.length() ==0){
            return false;
        }
        for(char ch:name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}