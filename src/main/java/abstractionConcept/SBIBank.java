package abstractionConcept;

public class SBIBank extends Bank{

	@Override
	public void loan() {
		System.out.println("SBI loan granted");
	}
	
	public void funds() {
		System.out.println("SBI funds");
	}
	
	

}
