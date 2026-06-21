abstract class Birds {
    abstract void fly();
    abstract void eat();
}

class Sparrow extends Birds {
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow is eating");
    }
}
public class MainAbtRACT {
    public static void main(String[] args) {
        Birds b = new Sparrow();
        b.fly();
        b.eat();
    }
}
