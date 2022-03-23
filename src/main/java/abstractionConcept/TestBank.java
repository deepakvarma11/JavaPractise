package abstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		SBIBank sbi = new SBIBank();
		
		sbi.credit();
		sbi.debit();
		sbi.loan();
		sbi.funds();
		
		Bank b = new SBIBank();  //Dynamic polymorphism
		
		b.credit();
		b.debit();
		b.loan();
//		b.funds(); // error we cannot access the funds using Bank class reference
		
	}
}
