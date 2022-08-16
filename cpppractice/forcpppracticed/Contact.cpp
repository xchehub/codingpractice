/*
 * Contact.cpp
 *
 *  Created on: 2022年8月16日
 *      Author: xcmpk
 */
#include "Contact.h"

using namespace std;

Contact::Contact(string n) :
		name(n), next(NULL) {
}

ostream& operator<<(ostream &os, const Contact &c) {
	return os << "Name: " << c.name;
}

