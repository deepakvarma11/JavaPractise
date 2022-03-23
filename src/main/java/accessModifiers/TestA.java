package accessModifiers;

public class TestA {

	public void methodPublic() {
		methodPrivate();
	}

	protected void methodProtected() {
		methodPrivate();
	}

	void methodDefault() {
		methodPrivate();
	}

	private void methodPrivate() {
		System.out.println("Indirectly calling this Private method of TestA class");
	}
}
