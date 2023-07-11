package practise;

public class FirstLetterCapitalInSentence {

	public static void main(String[] args) {
		String s = "mayur is an automation engineer";

		String[] ar = s.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ar.length; i++) {
			String str = ar[i];
			str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
//			str = str.substring(0, 1).toUpperCase() + str.substring(1);
			sb.append(str + " ");
		}
		System.out.println(sb.toString());

	}
}
