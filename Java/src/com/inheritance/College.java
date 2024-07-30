package com.inheritance;

class College {
	void display() {
		System.out.println("REC");
	}
}
class Dept extends College{
	void out() {
		System.out.println("CSE");
	}
}
class Year extends Dept{
	void print() {
		System.out.println("4th Year");
	}
}


