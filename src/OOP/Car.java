package OOP;

public class Car {

	//Method hidding --- Parent method is hidden and child's start method will be executed in case of static methods
	public static void start() {
		System.out.println("Car---start");

	}

	public void stop() {
		System.out.println("Car---stop");

	}

	public void refuel() {
		System.out.println("Car---refuel");

	}
}
