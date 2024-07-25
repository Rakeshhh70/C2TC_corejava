package com.constructor;

public class Demo {
	Demo() {
		System.out.println("Default Constructor");
		}
	Demo(int a){
		System.out.println("A:"+a);
	}
	Demo(int a,String b){
		System.out.println("B:"+a+"C:"+b);
	}
	Demo(String a){
		System.out.println("D:"+a);
		}
}
