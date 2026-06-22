import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class Hashset {

    public static void main(String[] args) {
        // HashSet<Integer> st = new HashSet<>();
        // st.add(10);
        // st.add(20);
        // st.add(30);
        // st.add(10);
        // st.add(20);
        // st.add(40);

        // Set<Integer> set1= new HashSet<>();
        // Set<Integer> set2= new HashSet<>();
        // set1.add(1);
        // set1.add(2);
        // set1.add(3);
        // set1.add(4);
        // set2.add(1);
        // set2.add(2);
        // set2.add(3);
        // set2.add(4);

        //Hashset ->O(1)
        //LinkedHashSet ->O(n)
        //TreeSet -> BST Tree->O(log n)

        // set1.containsAll(set2) ;
        // TreeSet<Integer> st = new TreeSet<>();
        // st.add(40);
        // st.add(20);
        // st.add(30);
        // st.add(10);
        // st.add(60);
        // st.add(50);

        
        // System.out.println(st);
        HashSet<Student> set = new HashSet<>();
        Student s1=new Student(1, "Ansh");
        Student s2=new Student(1, "Ansh");
        Student s3=new Student(1, "Ansh");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
        
    }
}