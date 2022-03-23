package singletonDesignPatt;

public class Square {
	
	private String value = "test";

	private static Square sq = null;

	private Square() {
	}

	public static Square getInstance() {
		if (sq == null) {
			sq = new Square();
		}
		return sq;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
