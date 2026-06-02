#include <iostream>
#include <string>
using namespace std;

// void fun(){
//     static int x=0; // static variable only get initialized once
//     cout << x<<endl;
//     x++;
// }
 class A{
    public :
    int x;
    void inex(){
        x++;
    }
 };

int main(){
    A obj;
    obj.x = 0;
    cout << obj.x<<endl;
    obj.inex();
    cout << obj.x<<endl;
    obj.inex();
    cout << obj.x<<endl;
    return 0;
}
