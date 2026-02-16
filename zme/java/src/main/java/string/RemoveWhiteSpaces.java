/*
 * Write a java program to remove all white spaces from a string?
 */

package string;

public class RemoveWhiteSpaces {

	public static void replaceAll(String str) {
		String strWithoutSpace = str.replaceAll("\\s", "");
		System.out.println(strWithoutSpace);
	}
	
	public static void remove(String str) {
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for (char c: charArray) {
			if (c != ' ' && c != '\t') {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
	
}
