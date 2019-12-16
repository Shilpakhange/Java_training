package OopsConceptPart1;

public interface Usbank {

	int min_bal = 100;

	public void debit();

	public void credit();

	public void transfermoney();

}

//// 1.Only method declaration is allowed in interface.
//2. No method definition only method prototype is mentioned.
//3. Methods are non-static in nature.
//4. Variables are static by default in interface.
//5. Value of variable can not be changed i.e.they are final or constant in nature.
//6. Object can not be created of interfaces.i.e they are abstract in nature.