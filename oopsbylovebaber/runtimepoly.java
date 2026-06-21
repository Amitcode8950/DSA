public class runtimepoly {
    public void drow(){
        System.out.println("shape drawing...");
    }
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.drow();
    }
}

class rectangle extends runtimepoly{
    public void drow(){
        System.out.println("rectangle drawing...");
    }
}
class circle extends runtimepoly{
   public void drow(){
       System.out.println("circle drawing...");
   }
}
