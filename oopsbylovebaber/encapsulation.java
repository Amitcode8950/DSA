public class encapsulation { // encapsulation is the process of wrapping data and methods into a single unit called class. It is one of the fundamental principles of object-oriented programming. Encapsulation helps to protect the data from unauthorized access and modification. It also helps to improve the maintainability and readability of the code.
    public static class Student {
        public int id;
        public int age;
        public String name;
        public int nos;
        private String gf;

        public Student(int id, int age, String name, int nos) {
            this.id = id;
            this.age = age;
            this.name = name;
            this.nos = nos;
        }

        public void sleep() {
            System.out.println(name + " is sleeping");
        }

        public void bunk() {
            System.out.println(name + " is bunking");
        }

        public void study() {
            System.out.println(name + " is studying");
        }

        public void gfchatting() {
            System.out.println(name + " is chatting with gf");
        }
        //the private variable gf can only be accessed within the class. To access the private variable gf, we need to use getter and setter methods. The getter method is used to get the value of the private variable gf and the setter method is used to set the value of the private variable gf.
        public String getGf() {
            return gf;
        }
        //setter method is used to set the value of the private variable gf. The setter method takes a parameter gf and assigns it to the private variable gf.
        public void setGf(String gf) {
            this.gf = gf;
        }
    }

    public static void main(String[] args) {
        Student A = new Student(1, 20, "Ayushi", 20);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
        A.setGf("Ayushicdscd");
        System.out.println(A.getGf());
    }

}
