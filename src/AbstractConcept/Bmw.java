package AbstractConcept;

public class Bmw implements Car {

	@Override
	public void start() {
		System.out.println("Bmw---start");
	}

	@Override
	public void stop() {
		System.out.println("Bmw---stop");

	}

	@Override
	public void refuel() {
		System.out.println("Bmw---refuel");

	}
	
	public void theftsafety() {
		System.out.println("Bmw----theftsafety");
	}

}
