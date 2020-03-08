package com.cuiwjava.tank.test;

public class Review {
	public static void main(String[] args) {
		Person p = new Person("laozhang");
		p.v = new Car();
		p.go("����");;
	}
}

class Person{
	String name;
	Vehicle v;
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void go(String where) {
		System.out.println(this.name + "��ʻ��");
		v.run();
		System.out.println("ȥ"+ where);
	}
}

abstract class Vehicle{
	public abstract void run();
}

class Car extends Vehicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car fly");
	}
	
}

class Broom extends Vehicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Broom fly");
	}
	
}