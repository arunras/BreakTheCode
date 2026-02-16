/*
 * find the percentage of uppercase letters, lowercase letters, 
 * digits and special characters in a given string?
 */
package string;

import java.text.DecimalFormat;

public class CharPercentage {

	public static void find(String str) {
		int totalChars = str.length();
		int totalUpperCase = 0;
		int totalLowerCase = 0;
		int totalDigit = 0;
		int totalOther = 0;
		
		char[] charArray = str.toCharArray();
		
		for (char c: charArray) {
			if (Character.isUpperCase(c)) {totalUpperCase++;}
			else if (Character.isLowerCase(c)) {totalLowerCase++;}
			else if (Character.isDigit(c)) {totalDigit++;}
			else {totalOther++;}
		}
		
		double upperCasePercentage = (totalUpperCase * 100.00) / totalChars;
		double lowerCasePercentage = (totalLowerCase * 100.00) / totalChars;
		double digitPercentage = (totalDigit * 100.00) / totalChars;
		double otherPercentage = (totalOther * 100.00) / totalChars;
		
		DecimalFormat f = new DecimalFormat("##.##");
		
		System.out.println("In '" + str + "' :");
		System.out.println("UpperCase: " + f.format(upperCasePercentage) + "%");
		System.out.println("LowerCase: " + f.format(lowerCasePercentage) + "%");
		System.out.println("Digit : " + f.format(digitPercentage) + "%");
		System.out.println("Other : " + f.format(otherPercentage) + "%");
	}
}
