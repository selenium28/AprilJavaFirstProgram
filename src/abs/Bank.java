package abs;

public abstract class Bank {

	// Partial Abstraction - 0-100%
	// Hiding the implementation logic and showing the functionality to the user is known as Abstraction.
	
	//No method body
	public abstract void rateOfIntrest();
	
	public void atmCard() {
		System.out.println("Bank- ATM Card");
	}

	public void ccCard() {
		System.out.println("Bank- cc Card");
	}

}
