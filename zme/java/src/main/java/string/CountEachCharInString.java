/*
 * Given a string , you have to count the number of occurrences of each character in it. 
 * For example, If “Java J2EE Java JSP J2EE” 
 * is the given string then occurrences of each character 
 * in this string is E=4, 2=2, v=2,  =4, P=1, S=1, a=4, J=5.
 */

package string;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharInString {

	public static void count(String str) {
		// create map to store each char as key, and occurrences as value
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		// Convert given string to char array
		char[] charArray = str.toUpperCase().toCharArray();
		
		// checking each char in charArray
		for(char c: charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		
		for (char c: charCountMap.keySet()) {
			if (charCountMap.get(c) > 1) {
				System.out.println(c + " : " + charCountMap.get(c));
			}
		}
		
		//System.out.println(charCountMap);
		
	}
}
