import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Collection;

public class computer {
   public int age;
   public String name;
   public int height;

   public String toString() {
      return "[computer@" + this.age + ", " + this.name + ", " + this.height + "]";
   }
   public computer(int var1, String var2, int var3) {
      this.age = var1;
      this.name = var2;
      this.height = var3;
   }

   public int getAge() {
      return this.age;
   }

   public String getName() {
      return this.name;
   }

   public int getHeight() {
      return this.height;
   }

  public static void main(String[] args) {
    List<computer> students = new ArrayList<>();
    students.add(new computer(20, "rahul", 180));
    students.add(new computer(22, "amit", 175));
    students.add(new computer(19, "sumit", 185));
    students.add(new computer(23, "rohit", 190));

    // Use comparators
System.out.println(students);
  Collections.sort(students , new Comparator<computer>(){
    
    @Override
    public int compare(computer o1, computer o2) {
      // TODO Auto-generated method stub
      return o1.age - o2.age;
    }
  }
);

  }
    
}
