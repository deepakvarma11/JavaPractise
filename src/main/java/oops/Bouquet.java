package oops;

import java.util.Scanner;


interface Flowers {
	
	// variables defined in Interfaces are always Final 

	int totalPrice(int no);
}

class Roses implements Flowers {
	private int price = 1;

	public int totalPrice(int no) {
		return this.price * no;
	}
}

class Jasmines implements Flowers {
	private int price = 2;

	public int totalPrice(int no) {
		return this.price * no;
	}
}

class Lilys implements Flowers {
	private int price = 3;

	public int totalPrice(int no) {
		return this.price * no;
	}
}

public class Bouquet {

	public static void main(String[] args) {
		Flowers f1 = new Roses();
		Flowers f2 = new Jasmines();
		Flowers f3 = new Lilys();

		Scanner sc = new Scanner(System.in);

		System.out.println("How many Red roses");
		int roses = sc.nextInt();

		System.out.println("How many Jasmines");
		int jas = sc.nextInt();

		System.out.println("How many Lilys");
		int lily = sc.nextInt();

		sc.close();

		System.out.println(
				"Total price of Bouquet : $" + (f1.totalPrice(roses) + f2.totalPrice(jas) + f3.totalPrice(lily)));

	}
}
