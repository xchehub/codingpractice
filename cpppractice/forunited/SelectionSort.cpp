//============================================================================
// Name        : SelectionSort.cpp
// Author      : joeho
// Version     :
// Copyright   : MIT license
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

// Selection sort function
void selectionSort(int A[], int n) {
	int j, small, temp;
	for (int i = 0; i < n-1; i++) {
		small = i ;
		// finding smallest element in unsorted array
		for (j = i+1; j < n; j++) {
			if (A[j] < A[small]) {
				small = j;
			}
		}
		// swapping the left most unsorted element
		temp = A[i];
		A[i] = A[small];
		A[small] = temp;
	}
}

// Function to display array elements
void displayArray(int A[], int n) {
	int i;
	for (i = 0; i < n; i++) {
		cout << A[i];
	}
	cout << "\n";
}

int main() {
//	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	int n;
	cout<<"enter size of array\n"; cin>>n;
	int A[n], i;
	cout<<"enter elements of array\n";

	for(i=0;i<n;i++)
	cin>>A[i]; cout<<"Array before sorting\n";

	displayArray(A,n);

	selectionSort(A,n);

	cout<<"Array after sorting\n";
	displayArray(A,n);
	return 0;
}
