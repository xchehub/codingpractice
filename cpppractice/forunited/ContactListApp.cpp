/*
 * ContactListApp.cpp
 *
 *  Created on: 2022年8月16日
 *      Author: xcmpk
 */
#include "ContactList.h"
#include <iostream>
#include <string>
using namespace std;

int main() {
	Contact *c1 = new Contact("Tom");
	Contact *c2 = new Contact("Bob");
	Contact *c3 = new Contact("Sally");

	ContactList *cl1 = new ContactList();

	cl1->addToHead(c1);
	cl1->addToHead(c2);
	cl1->addToHead(c3);

	std::string name;
	while (true) {
		cout << "Enter the name of the contact or q to quit." << endl;
		cin >> name;

		if (name == "q") {
			break;
		}
		Contact *contact = new Contact(name);

		cl1->addToHead(contact);
	}

}

