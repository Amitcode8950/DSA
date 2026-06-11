public class parameterisedconst {
    public static class Student {
        public int id;
        public String name;
        public int age;
        public String nos;
 

        // default constructor
        public Student(){
            System.out.println("i am default constructor");
        }
        //parameterised constr
        public Student(int id, String name, int age, String nos){
            this.id = id;
            this.name = name;
            this.age = age;
            this.nos = nos;
            System.out.println("i am parameterized constructor");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ayushi", 20, "Computer Science");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.id);
        System.out.println(s1.nos);
    }
}
