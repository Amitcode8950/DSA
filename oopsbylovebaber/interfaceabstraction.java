interface Birds {
    // abstract methods of interface used to provide abstraction in java
    void fly();
    void eat();
    // default method of interface used to provide default implementation of method in interface
    default void sleep() {
        System.out.println("Birds are sleeping");
    }
}
//abstract class Birds {
//    abstract void fly();
class Sparrow implements Birds {
    // @Override annotation is used to indicate that the method is overriding a method from the interface
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}

class crow implements Birds {
    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    public  void eat() {
        System.out.println("Crow is eating");
    }
}

public class interfaceabstraction {
    public static void dobirds(Birds b) {
        b.fly();
        b.eat();
        b.sleep();
    }

    public static void main(String[] args) {
        dobirds(new Sparrow());
        dobirds(new crow());

    }
}
