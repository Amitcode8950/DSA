import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 
import java.util.Objects;
import java.util.Comparator;


public class Student implements Comparable<Student> {
    public int age;
    public String name;
    public int height;

   public Student(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public int getAge(){ return age;}
    public String getName(){ return name;}
    public int getHeight(){ return height;}
    @Override
    public String toString()
    {
        return "[ "+this.name+ " "+this.age+" "+this.height+" ]";
    }
    @Override
    public int compareTo(Student that)
    {
        if(this.age==that.age)
        {
            return this.name.compareTo(that.name);
        }
        return this.age-that.age;
    }

   public static void main(String[] args) {
    List<Student> list= new ArrayList<>();
    list.add(new Student(22, "amit", 180));
    list.add(new Student(25, "sita", 165));
    list.add(new Student(22 , "ram", 175));
    list.add(new Student(23, "anushka", 160));
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
   }
}
