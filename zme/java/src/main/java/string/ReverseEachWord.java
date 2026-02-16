/*
 * Write a java program to reverse each word of a given string?
 */
package string;

public class ReverseEachWord {

	public static void reverse(String str) {
		String[] words = str.split(" ");
		StringBuilder reverseStr = new StringBuilder();
		
		for (int i = 0; i < words.length; i++) {
			StringBuilder reverseWord = new StringBuilder();
			for (int j = words[i].length() - 1; j >= 0; j--) {
				reverseWord.append(words[i].charAt(j));
			}
			reverseStr.append(reverseWord + " ");
		}
		System.out.print(str + " => " + reverseStr.toString());
	}
	
}
