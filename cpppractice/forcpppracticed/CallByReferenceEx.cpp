//============================================================================
// Name        : CallByReferenceEx.cpp
// Author      : joeho
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

// call by value
void A(int v1, int v2) {
	int t = v2; v2 = v1 + 3; v1 = t + 3;
}

// call by address
void pA(int * v1, int* v2) {
	int t = *v2; *v2 = *v1 + 2; *v1 = t - 4;
}

// call by reference
void rA(int &v1, int &v2) {
	int t = v2; v2 = v1 + 4; v1 = t - 5;
}

int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	int i = 1, j = 2;
	cout << i << j << "\n";
	A(i, j);
	cout << i << j << "\n";
	pA(&i, &j);
	cout << i << j << "\n";
	rA(i, j);
	cout << i << j << "\n";
	return 0;
}
