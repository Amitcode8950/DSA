public class blackatchar {
    public static String lastindex(String s,String part){
        while (s.contains(part)) {
            int index=s.lastIndexOf(part);
            s=s.substring(0,index)+s.substring(index+part.length());
        }
        return s;
    }
    public static void main(String[] args) {
        String s ="abcd";
        String part="bc";
        System.out.println(lastindex(s, part));
        
    }
}
