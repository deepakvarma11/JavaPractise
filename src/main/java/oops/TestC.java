package oops;

import accessModifiers.TestA;
import accessModifiers.TestB;

public class TestC {

	public static void main(String[] args) {
		new TestB().methodPublic();
//		new TestA().methodProtected();  //Protected visible to its own package and subclasses only 
		new TestA().methodPublic();
//		new TestB().methodDefault();    //Default visible to its own package and all classes only
	}

}
