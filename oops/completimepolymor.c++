//compile time polymorphism using function overloading with different number of arguments
#include <iostream>
#include <string>
using namespace std;
class car{
    public:
    //function overloading with different data type
    void show(char s){
        cout<<"first car char :"<<s<<endl;

    }
    //function overloading with different data type
    void show(int s){
        cout<<"second car int :"<<s<<endl;
    }
    

}; 
int main(){
    car a;
    
    a.show(10);
    // i can only call function whose all arguments are matched
    // if i want to call show('b')
    // it is not allowed 
    a.show('b');
    
    return 0;
}