//============================================================================
// Name        : LinkList.cpp
// Author      : joeho
// Version     :
// Copyright   : MIT
// Description :
// Reference   : https://www.codewhoop.com/linked-list
//============================================================================

#include <iostream>
using namespace std;

// Create Node structure
struct Node {
	int data;
	Node *link;
};

// creating head pointer and equating to NULL
Node *head = NULL;

// Function to insert at the beginning of linked list
void insertBeg(int d) {
	Node *ptr = new Node();
	ptr->data = d;
	ptr->link = head;
	head = ptr;
}

// Function to insert at the end of linked list
void insertEnd(int d) {
	Node *ptr = new Node();
	ptr->data = d;
	ptr->link = NULL;

	if (head == NULL) {
		head = ptr;
	} else {
		Node *temp = head;
		while ( temp->link != NULL) {
			temp = temp->link;
		}
		temp->link = ptr;
	}
}

// Function to display linked list
void dispLink(){
	Node *temp = head;
	while (temp != NULL) {
		cout << temp->data << " ";
		temp = temp->link;
	}
	cout << "\n";
}

//Function to delete node at the beginning
void deleteBeg(){
	//if list is empty.
	if(head==NULL) {
		cout<<"LIST IS EMPTY\n";
	} else {
		Node *ptr=head;
		head=head->link;
		free(ptr);
	}
}

//Function to delete node at the end
void deleteEnd() {
	Node *ptr;

	//if list is empty.
	if(head==NULL)
		cout<<"EMPTY LIST\n";
	//if list has only one node.
	if(head->link==NULL) {
		ptr=head;
		head=NULL;
		free(ptr);
	}
	//Traversing the list.
	else {
		Node *prev;
		ptr=head;
		while(ptr->link!=NULL) {
			prev=ptr;
			ptr=ptr->link;
		}
		prev->link=NULL;
		free(ptr);
	}
}

//Function to Display middle element
void showMid() {
	Node *slow = head;
	Node *fast = head;

	if(head == NULL)
		cout<<"List is Empty";
	else {
		while(fast != NULL && fast->link != NULL) {
			slow = slow->link;
			fast = fast->link->link;
		}
		cout << "Middle element is: " << slow->data;
	}

}

//Function to reverse linked list
void reverseList() {
	Node *p, *c, *n;
	p = NULL;
	c = head;
	while(c != NULL) {
		n = c->link;
		c->link = p;
		p = c;
		c = n;
	}
	head = p;
}

// Loop in a linked list refers to an endless cycle in the list such that if we start traversing the list we will never reach the end of the linked lis
int findLoop(Node *head) {
	Node *fast, *slow;
	slow = head;
	fast = head;

	while (fast != NULL && fast->link->link != NULL) {
		fast = fast->link->link;
		slow = fast->link;
		if (fast == slow) {
			return 1;
		}
	}
	return 0;
}

// Function for Delete node using one pointer


int main() {
//	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	Node *ptr = new Node();
	ptr->data = 2;
	ptr->link = NULL;
	head = ptr;
	cout << "data is " << head->data;

	cout << "\n======\n";
	insertBeg(2);
	insertBeg(1);
	insertEnd(3);
	dispLink();

	cout << "\n======\n";
	deleteBeg();
	dispLink();
	deleteEnd();
	dispLink();

	cout << "\n======\n";
	insertBeg(7);
	insertBeg(8);
	insertBeg(9);
	showMid();

	cout << "\n======\n";
	dispLink();
	reverseList();
	dispLink();

	return 0;
}
