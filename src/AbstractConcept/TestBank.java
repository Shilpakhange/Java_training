package AbstractConcept;

public class TestBank {

	public static void main(String[] args) {
		Hdfc hd = new Hdfc();
		
		hd.credit();
		hd.debit();
		hd.loan();
		hd.funds();
		
		//Dynamic polymorphism--
		
		Bank b=new Hdfc();
		b.credit();
		b.debit();
		b.loan();
		
		

	}

}
