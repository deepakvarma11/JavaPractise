package oops;

import java.util.Scanner;

interface Appliances {
	
	int powerConsumptions(boolean val);
}

class Fan implements Appliances {

	private int unit = 1;

	public int powerConsumptions(boolean val) {
		if (val) {
			return unit;
		}
		return 0;
	}

}

class Light implements Appliances {

	private int unit = 2;

	public int powerConsumptions(boolean val) {
		if (val) {
			return unit;
		}
		return 0;
	}

}

class TV implements Appliances {
	private int unit = 3;

	public int powerConsumptions(boolean val) {
		if (val) {
			return unit;
		}
		return 0;
	}

}

class Laptop implements Appliances {
	private int unit = 4;

	public int powerConsumptions(boolean val) {
		if (val) {
			return unit;
		}
		return 0;
	}

}

public class House {
	
	static Scanner sc = new Scanner(System.in);
	
	public static boolean value() {
		boolean x = true;
		while(x) {
			System.out.println("Enter Y/N");
			String va = sc.nextLine();
			if(va.length()==1 && (va.equalsIgnoreCase("y") || va.equalsIgnoreCase("n"))){
				x = false;
				return val(va);
			}
		}
		return false;
	}

	public static boolean val(String va) {
		if (va.equalsIgnoreCase("Y")) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println("Is Fan On? Y/N");
		boolean fan = value();

		System.out.println("Is Light On? Y/N");
		boolean light = value();

		System.out.println("Is TV On? Y/N");
		boolean tv = value();

		System.out.println("Is Laptop On? Y/N");
		boolean laptop = value();

		sc.close();

		Appliances a1 = new Fan();
		Appliances a2 = new Light();
		Appliances a3 = new TV();
		Appliances a4 = new Laptop();

		System.out.println("Power consumption is :" + (a1.powerConsumptions(fan) + a2.powerConsumptions(light)
				+ a3.powerConsumptions(tv) + a4.powerConsumptions(laptop)));

	}

}
