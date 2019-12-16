package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) { //throws ArithmeticException{ //compiler will take care of catching the exceptionn

		ThrowsKeyword obj=new ThrowsKeyword();
		//obj.div();
		obj.sum();
		System.out.println("Code completed");
		

}

	public void sum()// throws ArithmeticException
	{
		try {

			div();

		}// catch (ArithmeticException e) or
		//catch (Exception e)or
		//catch (Error e){
		catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void div() throws ArithmeticException {
		int b = 5 / 0; // exception line
	}
}
