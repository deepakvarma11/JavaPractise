package comparatorCamparable;

public class Laptop implements Comparable<Laptop> {

	private String laptopName;
	private int ram;
	private int price;

	public Laptop(String laptopName, int ram, int price) {
		super();
		this.laptopName = laptopName;
		this.ram = ram;
		this.price = price;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [laptopName=" + laptopName + ", ram=" + ram + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Laptop lap2) {

		// this > lap2 +
		// this < lap2 -
		// this == lap2 0

		if (this.getRam() > lap2.getRam()) {
			return 1;
		} else {
			return -1;
		}
	}

}
