public class Vehicle {
    public String name;
    public String model;
    public int noofTyres;

    Vehicle() {
        this.name = "";
        this.model = "";
        this.noofTyres = -1;
    }

    Vehicle(String name2, String model2, int noofTyres2) {
        this.name = name2;
        this.model = model2;
        this.noofTyres = noofTyres2;
    }

    void Startengine() {
        System.out.println("Engine started of " + name + " " + model);
    }

    void Stopengine() {
        System.out.println("Engine stopped of " + name + " " + model);
    }
 // inside the Vehicle class, we can create a subclass called car
    public class car extends Vehicle {
        public String tranmissionType;
        public int noofDoors;

        car(String name, String model, int noofTyres, String tranmissionType, int noofDoors) {
            super(name, model, noofTyres);
            this.tranmissionType = tranmissionType;
            this.noofDoors = noofDoors;

        }
        public void startAC(){
            System.out.println("AC started of " + name + " " + model);
        }

    }
    public class bike extends Vehicle {

    }


    public static void main(String[] args) {
        car car1 = new Vehicle().new car("BMW", "X5", 4, "Automatic", 4);
        System.out.println(car1.name);
        car1.startAC();
    }

}
