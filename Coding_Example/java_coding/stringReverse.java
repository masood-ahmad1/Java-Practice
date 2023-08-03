package java_coding;

public class stringReverse {

	static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// By using StringBuffer class
		StringBuffer sb = new StringBuffer("Masood Ahmad");
		System.out.println(sb.reverse());

		// Using iterative method

		String str = "Masood Ahmad";
		char[] myChar = str.toCharArray();
		// System.out.println(myChar);
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(myChar[i]);
		}
		System.out.println();
		
		System.out.println(recursiveMethod("ma"));
	}

}
