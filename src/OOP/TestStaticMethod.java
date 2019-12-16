package OOP;

public class TestStaticMethod {

	public static void main(String[] args) {
	
		Alto a=new Alto();
		//Car.start();   ------Executes Car start method.
		//Alto.start(); ------Executes Alto start method.
		a.start(); //--------Executes child class start method
		a.stop(); //-------overridden method ie. child stop method is called here.
	}
	

	
	

}
