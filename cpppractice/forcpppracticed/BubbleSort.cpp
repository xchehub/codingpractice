//============================================================================
// Name        : BubbleSort.cpp
// Author      : joeho
// Version     :
// Copyright   : MIT license
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

//bubble sort function
void BubbleSort(int A[], int n) {
	int flag , k , i, temp;
	//Outer loop
	for( k=1; k<n ; k++) {
		flag = 0;
		//inner loop
		for( i=0 ; i<n-k ; i++) {
			if(A[i] >A[i+1]) {
				//swapping
				temp = A[i];
				A[i] = A[i+1];
				A[i+1] = temp;
				//setting flag to 1
				flag = 1;
			}
		}
		// if flag==0 means no swaps i.e. array is sorted
		if(flag == 0 ) {
			break;
		}
	}
}

void displayArray(int A[],int n) {
	 int i;
	for(i=0;i<n;i++) {
		cout<<A[i]<<" ";
	}
	cout<<"\n";
}

int main() {
//	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	int n,i,e;
	cout<<"enter number of elements\n";
	cin>>n;
	int A[n];
	cout<<"enter elements\n";
	for(i=0;i<n;i++) {
		cin>>A[i];
	}

	cout<<"Array before sorting:\n";
	displayArray(A,n);

	//calling bubble sort function
	BubbleSort(A,n);
	cout<<"Array after sorting:\n";
	displayArray(A,n);
	return 0;
}
