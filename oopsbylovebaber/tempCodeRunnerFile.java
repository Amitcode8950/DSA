public class dynamicdispatch {
    public void drow() {
        System.out.println("shape drawing...");
    }

    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.drow();
    }

    public static void allshape(dynamicdispatch s) {
        s.drow();