package com.capg.java8;

public interface Person{
	public void eat();
}

public class AnonyInnerClassDemo implements Person{
	public static void main(String[] args) {
		Person p=new Person() {
			public void eat() {
				System.out.println("Eat Good Food");
			}
		};
		p.eat();
	}
}
