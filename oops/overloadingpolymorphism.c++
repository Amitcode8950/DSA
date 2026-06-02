//constructor overloading
#include <iostream>
using namespace std;
class Student{
    public:
    string name;

    Student(){
          cout<< "nonparameterised Constructor Called";
    }
    Student(string name){
        this->name = name;
        cout<< "parameterised Constructor Called";
    }

    
};
int main(){

    Student s1("riya");
}