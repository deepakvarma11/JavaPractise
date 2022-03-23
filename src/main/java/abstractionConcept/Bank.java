package abstractionConcept;

public abstract class Bank {
	
	int amt = 100;
	final int rate = 8;
	static int loanrate = 4;
	
	//partial abtraction 
	//hiding the implementation -- is called Abstraction
	// we ca define static , non-static, Final and non-final also we can have in Abstract classes
	//Can have abtract methods and non-abstract methods
	// We cannot create Bank class objects Bank b = new Bank();
	
	//non abstract method
	public abstract void loan();  // Abtract methods dont have body
	
	public void credit() {
		System.out.println("Creditted");
	}
	
	public void debit() {
		System.out.println("Debitted");
	}
	

}
