/*
 * Write a java program to count the total number of occurrences of 
 * a given character in a string without using any loop?
 */

package string;

public class CountCharOccurenceWithoutLoop {

	public static void count(String str, CharSequence c) {
		int count = str.length() - str.replace(c, "").length();
		System.out.println("Number of " + c + " = " + count);
	}
}
