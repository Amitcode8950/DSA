//abstract class
#include <iostream>
#include <string>
using namespace std;
//base class
class parent{
    public:
    //virtual function
    virtual void getinfo()=0;
};
class child:public parent{
    public:
    void getinfo(){
        cout<<"child class called"<<endl;
    }
};
int main(){
    child a;
    a.getinfo();
    return 0;
}