#include <iostream>
#include <string>
using namespace std;
// class defination
class teacher{
    private:
       double salary;
public:
    string name;
    string dept;
    string subject;
// member function
    void change_dept(string new_dept){
        dept=new_dept;
    };
    //setter
    void setsalary(double s){
        salary =s;
    }
    //getter
    double getsalary(){
        return salary;
    }

   };

int main(){
    // object creation
   teacher t1;
   // member initialization
   t1.name="khilan";
   t1.dept="maths"; 
   t1.setsalary(1000);
   t1.subject="calculus";
   // member function call
 cout << t1.name << endl;
 cout << t1.dept << endl;
 cout << t1.getsalary() << endl;
 cout << t1.subject << endl;
    
}