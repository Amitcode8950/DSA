#include <iostream>
#include <string>
using namespace std;

 class teacher{
    private :
    double salary;
    public :
    string name;
    string dept; 
    string school;
    int id;
    
    void setsalary(double s){
        salary=s;
    } 
    double getsalary(){
        return salary;
    }
 };

int main(){
    teacher t1;
    t1.id=1;
    t1.name="khilan";
    t1.dept="maths";
    t1.school="A";
    t1.setsalary(1000);
    cout << t1.id << endl;
    cout << t1.name << endl;
    cout << t1.dept << endl;
    cout << t1.school << endl;
    cout << t1.getsalary() << endl;
    return 0;
}