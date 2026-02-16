/*
 * How do you convert string to integer and integer to string in java?
 */
package string;

public class StringToInteger {

	public static void stringToInteger() {
		String s = "2015";
		int i = Integer.parseInt(s);
		int j = Integer.valueOf(s);
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void integerToString() {
		int i = 2016;
		String s = Integer.toString(i);
		String str = String.valueOf(i);
		System.out.println(s);
		System.out.println(str);
	}
}
