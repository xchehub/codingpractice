//============================================================================
// Name        : CppHomework.cpp
// Author      : joeho
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class A {
	public:
		A() {
			cout << "A in \n";
		}
		~A() {
			cout << "A out \n";
		}
};

class B: public A {
public:
	B() {
		cout << "B in \n";
	}
	~B() {
		cout << "B out \n";
	}
};

class AA {
	public:
		AA() {
			p();
		};
		~AA() {
			p();
		}
		virtual void p() {
			q();
		};
		virtual void q() {
			cout << "AA\n";
		};
};

class BB: public AA {
	public:
		BB() {
			p();
		};
		~BB() {
			p();
		}
		void q() {
			cout << "BB\n";
		}
};

int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!

	cout << "B class B \n";

	B* b = new B();
	delete b;

	cout << "A class B \n";
	A* a = new B();

	delete a;

	cout << "===== about virtual =====" << endl;

	AA* ptr = new BB();
	cout <<  "delete ptr" << endl;
	delete ptr;

	return 0;
}
