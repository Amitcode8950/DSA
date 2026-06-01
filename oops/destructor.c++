#include <iostream>
#include <String>
using namespace std;
class teacher{
    public:
    string name;
    double* cgpaptr;

    //  parameterised constructor
    teacher(string name,double cgpa){
        this->name=name;
        cgpaptr=new double;
        *cgpaptr=cgpa;
    }
    //  destructor
    ~teacher(){
        delete cgpaptr;
        cout << "destructor called" << endl;
    }
   // display 
    void getinfo(){
        cout << "name :" <<name << endl;
        cout << "cgpa :" <<*cgpaptr << endl;
    }
};
int main(){
    teacher t1("khilan",8.45);
    t1.getinfo();
    return 0;
}