package javaBasics;

public class B extends A {

	public B() {
		// super(10);
		System.out.println("Child class constructor");
	}

	public B(int i) {
		super(i); // ---super keyword is used to call parent class constructor.
		System.out.println("Child class constructor with value of i" + i);
	}

	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(20);

	}

}
