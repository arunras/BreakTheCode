/*
 * Write a java program to check whether two strings are anagram or not?
 */

package string;

import java.util.Arrays;

public class Anagram {

	public static void sortAndEquals(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "").toLowerCase();
		String str2 = s2.replaceAll("\\s", "").toLowerCase();
		
		boolean isAnagram = true;
		
		if (str1.length() != str2.length()) {
			isAnagram = false;
		} else {
			char [] charS1 = str1.toCharArray();
			char [] charS2 = str2.toCharArray();		
			Arrays.sort(charS1);
			Arrays.sort(charS2);		
			isAnagram = Arrays.equals(charS1, charS2);
		}
		
		if (isAnagram) {
			System.out.println(s1 + " and " + s2 + " are Anagram");
		} else {
			System.out.println(s1 + " and " + s2 + " are not Anagram");
		}
	}
	
	public static void iterative(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "").toLowerCase();
		String str2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean isAnagram = true;
		
		if (str1.length() != str2.length()) {
			isAnagram = false;
		} else {
			char[] s1Array = str1.toCharArray();
			for (char c: s1Array) {
				int index = str2.indexOf(c);
				if (index != -1) {
					str2 = str2.substring(0, index) + str2.substring(index+1, str2.length());
				} else {
					isAnagram = false;
					break;
				}
			}
		}
		
		if(isAnagram)
    {
        System.out.println(s1+" and "+s2+" are anagrams");
    }
    else
    {
        System.out.println(s1+" and "+s2+" are not anagrams");
    }
	}
	
	public static void stringBuilder(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "").toLowerCase();
		String str2 = s2.replaceAll("\\s", "").toLowerCase();
		
		boolean isAnagram = true;
		
		if (str1.length() != str2.length()) {
			isAnagram = false;
		} else {
			char[] charArray = str1.toCharArray();
			StringBuilder sb = new StringBuilder(str2);
			
			for (char c: charArray) {
				int index = sb.indexOf(""+c);
				if (index != -1) {
					sb.deleteCharAt(index);
				} else {
					isAnagram = false;
					break;
				}
			}
		}
		
		if(isAnagram)
    {
        System.out.println(s1+" and "+s2+" are anagrams");
    }
    else
    {
        System.out.println(s1+" and "+s2+" are not anagrams");
    }
	}
}
