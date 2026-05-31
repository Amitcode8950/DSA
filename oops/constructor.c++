#include <iostream>
#include <string>
using namespace std;

class teacher{
    private:
    double salary;
    public:
    teacher(){
        // this constructor is called automatically when we create an object of this class
        // enter data in contructor all is same for all object
        //no-parameterized constructor
        cout<<"constructor called"<<endl;
        school="Vaish collage of engg.";
    }
    string name;
    int id;
    string dept;
    string school;

    void setSalary(double s){
        salary =s;
    }
    double getsalary(){
        return salary;
    }
    
};
int main(){
    teacher t1;
    teacher t2;
    teacher t3;
    t1.name="khilan1";
    t1.id=1;
    t1.dept="maths1";
    
    t1.setSalary(10000);
    
    cout << "name1:" <<t1.name << endl;
    cout << "id1:"<<t1.id << endl;
    cout << "department1:"<<t1.dept << endl;
    cout << "school1:"<<t1.school << endl;
    cout<< "salary1:"<<t1.getsalary()<<endl;

    t2.name="khilan2";
    t2.id=2;
    t2.dept="physics2";
    t2.setSalary(20000);
    cout << "name2:" <<t2.name << endl;
    cout << "id2:"<<t2.id << endl;
    cout << "department2:"<<t2.dept << endl;
    cout << "school2:"<<t2.school << endl;
    cout<< "salary2:"<<t2.getsalary()<<endl;

    t3.name="khilan3";
    t3.id=3;
    t3.dept="chemistry3";
    t3.setSalary(30000);
    t3.school="A";
    cout << "name3:" <<t3.name << endl;
    cout << "id3:"<<t3.id << endl;
    cout << "department3:"<<t3.dept << endl;
    cout << "school3:"<<t3.school << endl;
    cout<< "salary3:"<<t3.getsalary()<<endl;
    return 0;
}