package TestmainMethod;

public class Testmain {

	// main() method can be overloaded as follow:
	// jvm will search the main method signature
	//i.e public static void  main(String[] args)
	// while executing the java application

	public static void main(String[] args) {
		System.out.println("In main method 1");
		main("selenuim");
		main(10);
		main(10, 20);
	}

	public static void main(String args) {
		System.out.println("In main method 2");

	}

	public static void main(int i) {
		System.out.println("In main method 3");

	}

	public static void main(int i, int j) {
		System.out.println("In main method 4");

	}

}
