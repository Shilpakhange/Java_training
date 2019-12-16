package AbstractConcept;

//Abstract class is defined using keyword abstract.
//Abstract class must contain at least one abstract method in it.
//TO achieve partial abstraction.
//Hiding implementation logic-- means abstraction
//Can not create object of abstract class.
//We can define all the types of vars here like static, non-static,final etc.

public abstract class Bank {
	
	int a=20;
	static double d=21.55;
	final char c='m';

	public abstract void loan();// abstract method

	public void debit() { // non-abstract method
		System.out.println("Bank---debit");

	}

	public void credit() {
		System.out.println("Bank ---credit");
	}
}
