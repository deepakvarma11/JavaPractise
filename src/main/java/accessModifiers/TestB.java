package accessModifiers;

public class TestB {

	public static void main(String[] args) {
		new TestA().methodDefault();
		new TestA().methodProtected();
		new TestA().methodPublic();
//		new TestA().methodPrivate(); //Private method visible to its own class only
	}

	public void methodPublic() {

	}

	protected void methodProtected() {

	}

	void methodDefault() {

	}

	private void methodPrivate() {
		System.out.println("Indirectly calling this Private method of TestB class");
	}
}
