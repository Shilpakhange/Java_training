package javaBasics;

public class ConstructorConcept {
	
	//constructor has no return type as well as no static type 
	 // It is not a function
	public ConstructorConcept() //--Default constructor
	{
		System.out.println("Default constructor");
		
	}
	
	public ConstructorConcept(int i) //-- Parameterized constructor
	{
		System.out.println("One param constructor");
		System.out.println("The value of i is:" +i);
	}
	
	public ConstructorConcept(int i,int j) //--Parameterized constructor
	{
		System.out.println("Two params constructor");
		System.out.println("The value of i is:" +i);
		System.out.println("The value of j is:" +j);


	}

	public static void main(String[] args) {

		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(10,20);

	}

		
	}


