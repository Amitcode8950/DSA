public class dynamicdispatch {
    public void drow() {
        System.out.println("shape drawing...");
    }




    public static void main(String[] args) {
       circle c = new circle();
       rectangle r = new rectangle();
       triangle t = new triangle();
       allshape(c);
       allshape(r);
       allshape(t);
       dynamicdispatch s = new dynamicdispatch();
       allshape(s);
    }

    public static void allshape(dynamicdispatch s) {
        s.drow();
    }
}

class rectangle extends dynamicdispatch {
    public void drow() {
        System.out.println("rectangle drawing...");
    }
}

class circle extends dynamicdispatch {
    public void drow() {
        System.out.println("circle drawing...");
    }
}

class triangle extends dynamicdispatch {
    public void drow() {
        System.out.println("triangle drawing...");
    }
}
