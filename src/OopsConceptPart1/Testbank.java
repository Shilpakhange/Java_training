package OopsConceptPart1;

public class Testbank {

	public static void main(String[] args) {
		
		HsbcBank hs = new HsbcBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.carloan();
		hs.eduloan();
		hs.mutualfund();

		//Child object can be refererd by parent interface reference which is nothing but the dynamic polymorphism
		
		Usbank ub=new HsbcBank();
		ub.credit();
		ub.debit();
		ub.transfermoney();
		System.out.println(Usbank.min_bal);
	}

}
