package OopsConceptPart1;

public class StaticAndNonstaticVar {

	int a=20;//Global and non static  variables
	static int b=60;//Global--Scope of global variable is throughout the class.
	public static void main(String[] args) {
		
		StaticAndNonstaticVar obj=new StaticAndNonstaticVar();
		int i=10;//local variable-Scope is within the function/method only.
		System.out.println(i);
	    System.out.println(obj.a);
	    System.out.println(StaticAndNonstaticVar.b);//static variable should be accessed using classname 
	    System.out.println(b);//static variable can be accessed directly as well.
		
	    obj.sendMail();//Non static method is called using object reference
	    
	    sum();//Static method is called directly.
	    StaticAndNonstaticVar.sum();//Static method is called using classname as well.

	}

	
	public void sendMail() {  //Non-static method
		System.out.println("In the sendMail method....");
	}
	public static void sum() {//Static method
		System.out.println("In sum method...");
	}
}
