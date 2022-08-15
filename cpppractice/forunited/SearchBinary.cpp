//============================================================================
// Name        : SearchBinary.cpp
// Author      : joeho
// Version     :
// Copyright   : MIT license
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

//Function to perform Binary Search
int BinarySearch(int A[], int n, int e) {
	int start, end, mid;
	start = 0;
	end = n - 1;
	while (start <= end) {
		mid = (start + end) / 2;
		if (A[mid] == e)
			return mid;
		else if (e > A[mid])
			start = mid + 1;
		else if (e < A[mid])
			end = mid - 1;
	}
	return -1;
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
	ans = BinarySearch(A, n, e);
	if (ans == -1)
		cout << "not found\n";
	else
		cout << "Found at index:" << ans;
	return 0;
}
