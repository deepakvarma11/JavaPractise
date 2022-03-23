package abstractionConcept;

public interface Car {
	
	//Variable defined will be defaultly Final and static
	int wheels =4;

	//In interface, we always define abstract methods
	// we can achieve 100% abstraction using interfaces
	// in Interface, we can define only final and static variables
	//cannot create objects of abstract classes and interfaces 
	
	
	public void start();
	public void stop();
	public void refuel();
}
