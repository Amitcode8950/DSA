#include <iostream>
#include <string>
using namespace std;
class parent{
    public:
    void getinfo(){
        cout<<"parent class called"<<endl;
    }
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