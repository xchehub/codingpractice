/*
 * ContactList.cpp
 *
 *  Created on: 2022年8月16日
 *      Author: xcmpk
 */
#include "ContactList.h"
using namespace std;

ContactList::ContactList() :
		head(NULL), size(0) {
}

void ContactList::addToHead(Contact *newOne) {
	if (head == NULL) {
		head = newOne;
	} else {
		newOne->next = head;
		head = newOne;
	}

	size++;
}
