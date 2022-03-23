package strings;

import static java.lang.System.*;  // static import  // https://www.youtube.com/watch?v=kHWcA4X2anE
public class StringComparism {
	
	// https://www.youtube.com/watch?v=to9DPVsdByE
	
	public static void main(String[] args) {
		String a = "dog";
		String b = new String("dog");
		String c = "dog";
		
		if(a.hashCode()==b.hashCode()) {
			System.out.println("Equal hashcode");
		}else {
			System.out.println("Hashcode not equal");
		}
		
		
		if(a==b) {  // compare objects reference
			out.println("true");  				// We can call the static methods directly if static import is defined
		}else {
			System.out.println("False");
		}
		
		if(a.equals(b)) {  // compare text
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		
		if(a==c) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		
		if(a.equals(c)) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		
	}

}
