/*
 * Write a java program to reverse a given string with preserving the position of spaces?
 */
package string;

public class ReverseWithSpaces {

	public static void reverse(String str) {
		char[] charArray = str.toCharArray();
		char[] resultArray = new char[charArray.length];
		
		for (int i = 0; i < charArray.length; i ++) {
			if (charArray[i] == ' ') {
				resultArray[i] = '_';
			}
		}
		
		int j = resultArray.length - 1;
		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				if (resultArray[j] == '_') j--;
				resultArray[j] = charArray[i];
				j--;
			}
		}
		System.out.println(str + " => " + String.valueOf(resultArray));
	}
}
