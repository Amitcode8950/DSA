#include<iostream>
#include<string>
using namespace std;
class teacher{
    private:
    double salary;
    public:
    string name;
    int id;
    string dept;
    //parameterized constructor 
    teacher(int id , string name, string dept,double salary){
        this->id=id;
        this->name=name;
        this->dept=dept;
        this->salary=salary;
    } 
    void setSalary(double s){
        salary = s;
    }
    double getSalary(){
        return salary;
    }
    void getInfo(){
        cout<<id<<endl;
        cout<<name<<endl;
        cout<<dept<<endl;
        cout<<getSalary()<<endl;
    }   
};
int main(){
    teacher t1(1,"khilan","maths",10000);
    t1.getInfo();
    return 0;  
}