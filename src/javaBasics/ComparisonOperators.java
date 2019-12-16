package javaBasics;

public class ComparisonOperators {

	public static void main(String [] args) {
	
	
	int a=100;
	int b=200;
	int c=300;
	
	//Different comparison operators are:
	 //<, >, <=,>=,==,!=
	
	if (a>b & a>c)
	{
		System.out.println("a is greatest");
	}
	else if(b>c)
	{
		System.out.println("B is the greatesst");
	}
	else {
		System.out.println("c is greatest");
		
	}
	
}
}