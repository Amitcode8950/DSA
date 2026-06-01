#include <iostream>
#include <String>
using namespace std;

class teacher{
    private :
       double salary;
    public:
       int id;
       string name;
       string school;
       string obj;

    teacher(int id,string name,string school,string obj){
        this->id=id;
        this->name=name;
        this->school=school;
        this->obj=obj;
    }
    void getsalry(double s){
        salary =s;
    }
    double getsalry(){
        return salary;
    }
    //copy constructor
    teacher(teacher &orgobj){   // pass by refrence
        cout << "copy constructor called" << endl;
        this->id=orgobj.id;
        this->name=orgobj.name;
        this->school=orgobj.school;
        this->obj=orgobj.obj;
        this->salary=orgobj.salary;
     }
     void getdata(){
        cout << "id :" <<id << endl;
        cout << "name :" <<name << endl;
        cout << "school :" <<school << endl;
        cout << "obj :" <<obj << endl;
        cout << "salary :" <<salary << endl;
     }
};
int main(){
    teacher t1(1,"khilan","vaish college","t1");
    
    teacher t2(t1);        // default copy constructor call
    t2.getdata();
    return 0;
}