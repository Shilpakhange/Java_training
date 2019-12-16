package AbstractConcept;
//Interface contains all the abstract methods in it. Thus we can achieve 100% abstraction.
//No need to write abstract keyword for methods by default methods are abstract methods i.e only method declaration
  //no method body
//Can not create objects of interface
//It can have only final and static variable

public interface Car {
	
	int b=100;
	
	public void start();

	public void stop();

	public void refuel();
}
