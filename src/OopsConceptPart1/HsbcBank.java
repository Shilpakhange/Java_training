package OopsConceptPart1;

public class HsbcBank implements Usbank,Brazilbank { //Multiple inheritance is achieved here--
// This relation is also called as "has a relationship" 
//3 Methods overriden from USbank ----
	public void credit() {
		System.out.println("Hsbc----credit method");
	}

	public void debit() {
		System.out.println("Hsbc----debit method");
	}

	public void transfermoney() {
		System.out.println("Hsbc----transfermoney method");
	}
	
	// 2 Methods are of hsbcbanks own methods 
	
	public void carloan() {
		System.out.println("Hsbc-----carloan method");
	}
	
	public void eduloan() {
		System.out.println("Hsbc----eduloan method");
	}
	
	//Below method overriden from Brazilbank
	
	public void mutualfund() {
		System.out.println("Hsbc---mutualfund method");
	}
}

