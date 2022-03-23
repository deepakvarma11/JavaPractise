package exceptionHandlings;

public class Returning {

	public static void main(String[] args) {
		System.out.println(method());
	}
	
	public static boolean method() {
		
		try {
			System.out.println(8/2);
			return true;
			
		}catch (Exception e) {
			System.out.println("Catch block");
			return false;
		}finally {
			System.out.println("Finally");
			return true;
		}
	}
}
