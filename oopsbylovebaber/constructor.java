
public class constructor {
    public int id;
    public int age;
    public String name;
    public String nos;

    // default constructor
    public constructor() {
        System.out.println("i am default constructor");
    }

    // parameterized constructor
    public constructor(int idx, String name, int age, String nos) {
        this.id = idx;
        this.name = name;
        this.age = age;
        this.nos = nos;
        System.out.println("i am parameterized constructor");
    }

    public static void main(String[] args) {
        constructor s1 = new constructor(1, "Ayushi", 20, "Computer Science");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.id);
        System.out.println(s1.nos);

    }
   
}
