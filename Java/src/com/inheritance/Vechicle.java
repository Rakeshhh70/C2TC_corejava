package com.inheritance;

public class Vechicle {
	void type() {
		System.out.println("Two Wheeler and Four Wheeler");
	}
}
class Bike extends Vechicle{
	void type1() {
		System.out.println("Two Wheeler");
	}
}
class Car extends Vechicle{
	void type2() {
		System.out.println("Four Wheeler");
	}
}
