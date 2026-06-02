#include <iostream>
#include <string>
using namespace std;

// parent class
class Person{
public:
    string name;

    int age;
    //  Person(string name, int age){
    //     this->name=name;
    //     this->age=age;
    //  }
    Person(){
        cout<<"constructor of person class called "<<endl;
    }
};
// child class
class Student : public Person{
public:
     int rollno;
     // child class constructor
     Student(){
        cout<<"constructor of student class called "<<endl;
     }
     void getinfo(){
        cout<<"name "<<name ;
        cout<<"age "<<age;
        cout<<"rollno "<<rollno;
     }
};
int main(){
    Student s1;
    s1.name="Amit kumar";
    s1.age=21;
    s1.rollno=211;
    s1.getinfo();
    return 0;
}
