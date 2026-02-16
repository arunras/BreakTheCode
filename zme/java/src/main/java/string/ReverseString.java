/*
 * Write a java program to reverse a string.
 */

package string;

public class ReverseString {
	
	public static void stringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	
	public static void iterative(String str) {
		char[] charArray = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = charArray.length - 1; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		System.out.println(sb.toString());
	}
	
	public static String recursive(String str) {
		if ((str == null) || (str.length() <= 1)) {
			return str;
		}
		return recursive(str.substring(1)) + str.charAt(0);
	}
	
}
