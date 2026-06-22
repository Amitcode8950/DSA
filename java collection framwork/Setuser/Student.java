import java.util.Objects;

public class Student {
    public int rollNo;
    public String name;

    public Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    public String toString(){
        return "Student {"+
        "rollNo="+rollNo+
        ",name='"+name+ '\''+
        "}";
    }
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Student student=(Student) o;
        return rollNo==student.rollNo && name.equals(student.name);
    }
    public int hashCode(){
        return Objects.hash(rollNo,name);
    }
}
