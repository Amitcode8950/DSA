
// to do so must define the blueprint  class

public class createclass {
   // ✅ CLASS — This is the blueprint/template for a Student
   public static class Student{
    
    public int id;
    public int age;
    public String name;
    public String nos;

    // default constructor
    public Student(){
        System.out.println("Default Constructor is called");
    }

    //methods and behavior
    public void study(){
        System.out.println(name + "is studying");
    }
    public void sleep(){
        System.out.println(name + "is sleeping");
    }
    public void bunk(){
        System.out.println( name + "is bunking the class");
    }
   }
   public static void main(String[] args) {
    // ✅ OBJECT — s1 is an object (instance) created from the Student class
    Student s1 = new Student();
    s1.name = "Ayushi";
    s1.age = 20;
    s1.id = 1;
    s1.nos = "Computer Science";
    
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.id);
    System.out.println(s1.nos);
    s1.study();
    s1.sleep();
    s1.bunk();
   }
}
