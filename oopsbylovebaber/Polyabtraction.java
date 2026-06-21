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

class crow extends Birds {
    @Override
    void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    void eat() {
        System.out.println("Crow is eating");
    }
}

public class Polyabtraction{
    public static void dobirds(Birds b) {
        b.fly();
        b.eat();
    }
    public static void main(String[] args) {
       dobirds(new Sparrow());
       dobirds(new crow());

    }
}
