package casting;

public class Casting implements CInteraface {

	@Override
	public void printA() {
		// TODO Auto-generated method stub
		System.out.println("print A");
	}

	@Override
	public void printC() {
		// TODO Auto-generated method stub
		System.out.println("print C");
	}

	public static void main(String[] args) {
		CInteraface c = new Casting();

//		BInterface b = (BInterface) c;
//
//		b.printB();

		Ainterface a = new Ainterface() {

			@Override
			public void printA() {
				// TODO Auto-generated method stub
				System.out.println("print A anymouser");
			}
		};

		a.printA();

	}

}
