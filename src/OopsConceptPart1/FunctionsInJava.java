package OopsConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {

		
		//Non static methods require object of the class to access them:
		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		int p=obj.abc();
		System.out.println(p);
		String s1=obj.pqr();
		System.out.println(s1);
		int q=obj.division(30, 10);
		System.out.println(q);
		
	}

	
	//Non static functions/methods are defined as follows:->
	//1.Here method has no input parameter as well as no output i.e return value is void
	public void test() {
		System.out.println("In test method");
		
	}
	
	//2.In this method there is no input parameter but it has output i.e method returns int value. 
	public int abc() {
	System.out.println("In the abc method");
		int i=30;
		int j=90;
		int k=i+j;
		return k;
	}
	
	//3.In this method return type is String.
	public String pqr() {
		System.out.println("In the pqr method");
		String s="Selenium";
		return s;
		
	}
	
	//4. Here in this method there are 2 input arguments to the function and it returns int value.
	public int division(int x, int y) {
		System.out.println("In the division method");
		int d=x/y;
		return d;
	}
	
	
}
