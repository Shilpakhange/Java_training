package OopsConceptPart1;

public class car {

	//Declare class variables-->
	int model;
	int price;
	
	public static void main(String[] args) {

		//new car():- It is the object of class car.
		//fiat & brio :- These are the object reference variables referring to the new car() object.
		
		car fiat=new car();
		car brio=new car();
		
		fiat.model=586;
		fiat .price=400000;
		System.out.println(fiat.model);
		System.out.println(fiat.price);
		
		brio.model=9655;
		brio.price=500000;
		

		
		
	}

}
