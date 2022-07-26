#include <cstdio>
#include <iostream>
#include <string>

using namespace std;

namespace First {
    namespace Nested {
        void foo() {
            printf("This First::Nested::foo\n");
        }
    }
}

namespace Second {
    void foo () {
        printf("This Second::foo\n");
    }
}

string myString = "Hello";
string myOtherString = "world";

void foo() {
    printf("This global foo\n");
}

void print(char const* myString) {
    printf("String %s\n", myString);
}

void print(int myInt) {
    printf("My int is %d\n", myInt);
}

void doSomethingWithInts(int a = 1, int b = 4) {
    // 
    printf("doSomethingWithInts: %d %d\n", a, b);
}
int main (int argc, char** argv) {

    // Prints hello world
    printf("1 Hello world!\n");
    cout << "2 Hello world!" << endl;

    print("Hello");
    print(4);

    doSomethingWithInts();
    doSomethingWithInts(5, 6);
    doSomethingWithInts(1000);

    using namespace Second;

    Second::foo();
    First::Nested::foo();
    ::foo();

    int myInt;
    cout << "Enter your favorite number: ";
    cin >> myInt;
    cout << "Your favorite number is " << myInt << endl;
    cerr << "used for error messages" << endl;
    

    return 0;
}

