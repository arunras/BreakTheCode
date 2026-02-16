/*
 *  Write a java program to find the duplicate words and their number of occurrences in a string?
 */

package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void duplicateWords(String str) {
		// split str into words
		String[] words = str.split(" ");
		
		// create HashMap with word as key, and count as value
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		
		// checking each word
		for (String w: words) {
			if (wordMap.containsKey(w.toLowerCase())) {
				wordMap.put(w.toLowerCase(), wordMap.get(w.toLowerCase()) + 1);
			} else {
				wordMap.put(w.toLowerCase(), 1);
			}
		}
		
		// Extract all keys of wordMap
		Set<String> wordSet = wordMap.keySet();
		
		// Iterate through all words in wordSet
		for (String s: wordSet) {
			if (wordMap.get(s) > 1) {
				System.out.println(s + " : " + wordMap.get(s));
			}
		}
	}
}
