package core.random3;

import core.random.FinallyDemo;

class Parent {
	Parent() {
		System.out.println("Parent constructor");
	}

	static {
		System.out.println("inside Parent static Block");
	}

	{
		System.out.println("inside Parent Block");
	}

}

class Child extends Parent {
	String name;

	Child() {

		System.out.println("Child constructor");
	}

	static {
		System.out.println("inside child static Block");
	}
	{
		System.out.println("inside child Block");
	}

}

public class FinallyDemo2 {

	public static void main(String[] args) {
		Child demo = new Child();
		//Parent demo2 = new Parent();

	}

}