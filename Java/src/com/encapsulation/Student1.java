package com.encapsulation;

public class Student1 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name="Rakesh";
		s.Age=21;
		s.regNO=1045;
		s.per=95.9f;
		System.out.println(s);
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}

}
