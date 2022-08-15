//============================================================================
// Name        : SearchLinear.cpp
// Author      : joeho
// Version     :
// Copyright   : MIT license
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

//Function to perform Linear Search
int LinearSearch(int A[], int n, int e) {
	int i, found = -1;
	for (i = 0; i < n; i++) {
		if (A[i] == e) {
			found = i;
			break;
		}
	}
	return found;
}

int main() {
	int n;
	cout << "enter size of array\n";
	cin >> n;
	int A[n], e, i, ans;
	cout << "enter elements of array\n";
	for (i = 0; i < n; i++)
		cin >> A[i];
	cout << "enter element to be found\n";
	cin >> e;
	ans = LinearSearch(A, n, e);
	if (ans == -1)
		cout << "not found\n";
	else
		cout << "Found at index:" << ans;
	return 0;
}
