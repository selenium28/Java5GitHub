package abs;

public abstract class Bank {
	// Partial Abstraction
	//hiding the implementation logic---is called abstraction

	// NO method body
	public abstract void rateOfInstrest();  // Abstract method

	//Non-Abstract method
	public void atmCard() {
		System.out.println("Bank----atmCard");
	}

	public void ccCard() {
		System.out.println("Bank----ccCard");
	}

}
