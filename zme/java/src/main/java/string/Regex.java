package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static StringBuilder filterVowels(String str) {
		StringBuilder sb = new StringBuilder();
		StringBuilder conStr = new StringBuilder();
		if (str.length() > 0) {
			//Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
			Pattern vowelPattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
			Matcher matcher = vowelPattern.matcher(str);
			
			while(matcher.find()) {
				sb.append(matcher.group());
			}
			
			for (int i = 0; i < str.length(); i++) {
				if (matcher.find()) {
					//conStr.append(matcher.group());
					System.out.println(matcher.group());
				} else {
					//conStr.append(str.charAt(i));
				}
			}
		}
		return sb;
	}

	public static int countVowelsRegex(String str) {
		int count = 0;

		if (str.length() > 0) {
			// Create a pattern that detects vowels.
			Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
			Matcher vowelMatcher = vowelPattern.matcher(str);

			// Look for the next match and if found, add to count and repeat.
			while (vowelMatcher.find()) {
				count++;
				System.out.print(vowelMatcher.group());
			}
		}
		return count;
	}
	
	
}
