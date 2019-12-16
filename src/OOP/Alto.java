package OOP;

public class Alto extends Car {

	// Static methods can not be override from parent.
	public static void start() {
		System.out.println("Alto---start");
	}
	@Override
	public void stop() {
		System.out.println("Alto----stop method");
	}
	
	public void theftsafety() {
		System.out.println("Alto--- theftsafety");
	}
}
