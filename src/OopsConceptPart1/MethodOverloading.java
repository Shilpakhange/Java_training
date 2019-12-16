package OopsConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(25);
		obj.sum(25, 75);
		obj.sum(65.333);
	}

	public static void main(int a) {
		
	}
	//We can overload the main method also
	//We can not create other method inside one method
	//Duplicate methods : Methods with the same name and same input parameters are not allowed
	//Method overloading means use of the same method name with the different number of arguments within the same class
	public void sum() {
		System.out.println("Sum method---0 arguments");
	}
	
	public void sum(int i) {
		System.out.println("Sum method---1 arguments");
		System.out.println(i);
	}
	
	public void sum(double d) {
		System.out.println(d);
	}
	
	public void sum(int j,int k) {
		System.out.println("sum method---2 arguments");
		System.out.println(j+k);
	}
}
