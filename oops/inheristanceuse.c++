// using inheristance use
#include <iostream>
#include <string>
using namespace std;
// parent class
class Person{
public:
    string name;
    int age;
  Person(string name, int age){
        cout<<"constructor of person class called "<<endl;
        this->name= name;
        this->age=age;
    }
};
class Student: public Person{
public:
    int rollno;
    Student(string name, int age, int rollno):Person(name,age){
        cout<<"constructor of student class called "<<endl;
        this->rollno=rollno;
    }
    void getinfo(){
        cout<<"name "<<name <<endl; 
        cout<<"age "<<age <<endl;
        cout<<"rollno "<<rollno <<endl;
    }
};
int main(){
    Student s1("Amit kumar",21,211);
    s1.getinfo();
    return 0;
}