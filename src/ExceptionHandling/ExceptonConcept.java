package ExceptionHandling;

public class ExceptonConcept {
//	int a = 10;
//	static ExceptonConcept obj;

	public static void main(String[] args) {

		// uncaught exception, as there is no hint from complier about divide by zero
		// error.
//		int i = 9 / 0;
//		System.out.println(i);
//		
		// caught exception, as complier gives hint to handle the exception.
		// Thread.sleep(2000);

		// ExceptonConcept obj=null;
//		ExceptonConcept obj1 = new ExceptonConcept();
//		//obj1 = null;
//		System.out.println(obj.a);
//		System.out.println(obj1.a);
		
		//1.try catch block
		
		try {
			int i=6/0;
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("demo try catch");
	}

}
