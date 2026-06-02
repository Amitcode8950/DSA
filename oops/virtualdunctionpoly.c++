//runtime polymorphism using virtual function
#include <iostream>
#include <string>
using namespace std;
//base class
class parent{
    public:
    //virtual function
    void getinfo(){
        cout<<"parent class called"<<endl;
    }
    virtual void hello(){
        cout << "hello from parent class"<<endl;
    }

};
class child:public parent{
    public:
    void getinfo(){
        cout<<"child class called"<<endl;
    }
    void hello(){
        cout << "hello from child class"<<endl;
    }

};
int main(){
    parent a;
    a.hello();
    return 0;
}