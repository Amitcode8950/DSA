public class copyconst {

    // ✅ Fix 1: Made 'static' so it can be used inside static main()
    public static class Innercopyconst {
       public int id;
       public int age;
       public String name;
       public String nos;

       // default constructor
       public Innercopyconst(){
           System.out.println("i am default constructor");
       }

       // parameterised constructor
       public Innercopyconst(int id, String name, int age, String nos){
           this.id = id;
           this.name = name;
           this.age = age;
           this.nos = nos;
           System.out.println("i am parameterized constructor");
       }

       // ✅ Fix 2: Copy constructor — copies all fields from another object
       public Innercopyconst(Innercopyconst other){
           this.id = other.id;
           this.name = other.name;
           this.age = other.age;
           this.nos = other.nos;
           System.out.println("i am copy constructor");
       }
    }

    public static void main(String[] args) {
        Innercopyconst s1 = new Innercopyconst(1, "Ayushi", 20, "Computer Science");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.id);
        System.out.println(s1.nos);

        Innercopyconst s2 = new Innercopyconst(s1);  // copy constructor call
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.id);
        System.out.println(s2.nos);
    }
}
