//============================================================================
// Name        : CppLinkedList.cpp
// Author      : joeho
// Version     :
// Copyright   : MIT license
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

struct Node {
	int data;
	Node *link;
};

typedef Node* NodePtr;

void insert(NodePtr &head, int data) {
	NodePtr tmpPtr;
	tmpPtr = new Node;
	tmpPtr->data = data;
	tmpPtr->link = head;
	head = tmpPtr;
}

int main() {

	NodePtr head;
	head = new Node;
	head->data = 20;
	head->link = NULL;

	cout << head->data << endl;
	cout << "=====" << endl;
	insert(head, 30);
	NodePtr tmp = head;
	while (tmp != NULL) {
		cout << tmp->data << endl;
		tmp = tmp->link;
	}
	return 0;
}
