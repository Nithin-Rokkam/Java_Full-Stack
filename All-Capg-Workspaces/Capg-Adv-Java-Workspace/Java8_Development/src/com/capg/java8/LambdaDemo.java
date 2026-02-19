package com.capg.java8;

@FunctionalInterface
public interface Person{
	public void eat();
}

public class LambdaDemo {
	public static void main(String[] args) {
		Person p=()->{
				System.out.println("Eat good food");
		};
		p.eat();
	}
}
