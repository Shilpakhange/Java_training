package AbstractConcept;

public class TestCar {

	public static void main(String[] args) {

		//static polymorphism---Child class object can access all the parent interface methods.
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		
		//Dynamic polymorphism---Parent interface object can refer to the child class object.
		
		Car c=new Bmw();
		c.start();
		c.stop();
		c.refuel();
		//Can not access the theftsafety() method as it is restricted to only bmw class.
	}

}
