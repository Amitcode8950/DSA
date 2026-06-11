
public class Student {
    public int id;
    public int age;
    public String name;
    public String nos;

    // default constructor
    public Student() {
        System.out.println("i am default constructor");
    }

    // parameterized constructor
    public Student(int idx, String name, int age, String nos) {
        this.id = idx;
        this.name = name;
        this.age = age;
        this.nos = nos;
        System.out.println("i am parameterized constructor");
    }

   
}
