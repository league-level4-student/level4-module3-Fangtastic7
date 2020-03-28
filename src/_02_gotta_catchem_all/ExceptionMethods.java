package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double arg1, double arg2) {
	double quotient;
	if(arg2 == 0.0) {
		throw new IllegalArgumentException();
	}
	quotient = arg1/arg2;
		return quotient;
	}
	public static String reverseString(String word) {
		String word2 = "";
		if(word2 == "") {
			throw new IllegalStateException();
		}
		for(int i = 0; i<word.length();i++) {
			word2 = word2 + word.charAt(word.length()-1-i);
		}
		System.out.println(word2);
		return word2;
	}
}
