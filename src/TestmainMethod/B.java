package TestmainMethod;

public class B {

	//We can call main method of class A as follows:
	
	public static void main(String[] args) {
		System.out.println("In method B--");
		A.main(args);
	}

}
