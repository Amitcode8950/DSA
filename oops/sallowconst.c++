#include <iostream>
#include <String>
using namespace std;
class teacher{
    public:
    string name;
    double cgpa;

    teacher(string name,double cgpa){
        this->name=name;
        this->cgpa=cgpa;
    }
    
    //copy constructor
    teacher(teacher &orgobj){   // pass by refrence
        cout << "copy constructor called" << endl;
        this->cgpa=orgobj.cgpa;
        this->name=orgobj.name;
    }
    void getinfo(){
        cout << "name :" <<name << endl;
        cout << "cgpa :" <<cgpa << endl;
    }
};
int main(){
    teacher t1("khilan",8.45);
    
    teacher t2(t1);  //  copy constructor call  
    t2.getinfo();
    return 0;
}