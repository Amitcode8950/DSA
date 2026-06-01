#include <iostream>
#include <String>
using namespace std;
class teacher{
    public:
    string name;
    double* cgpaptr;
//  deep copy constructor
    teacher(teacher &orgobj){
        cout << "copy constructor called" << endl;
        cgpaptr=new double;
        *cgpaptr=orgobj.cgpaptr;
        name=orgobj.name;
    }
    //  parameterised constructor
    teacher(string name,double cgpa){
        this->name=name;
        cgpaptr=new double;
        *cgpaptr=cgpa;
    }
    
   // display 
    void getinfo(){
        cout << "name :" <<name << endl;
        cout << "cgpa :" <<*cgpaptr << endl;
    }
};
int main(){
    teacher t1("khilan",8.45);
    
    teacher t2(t1);  //  copy constructor call  
    t2.getinfo();
    return 0;
}