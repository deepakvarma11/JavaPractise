package customer;

public class CustomerCal {

	// Liskov Substitution Principle (LSP)

	public static void cal(Customer cus, int price) {
		System.out.println(cus.getCharge() + price);
	}

	public static void main(String[] args) {

		cal(new Customer(), 100);
		cal(new VipCustomer(), 100);

	}

}
