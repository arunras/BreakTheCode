package string;

import java.util.HashSet;
import java.util.Set;

public class AllUniqueChars {
	
	public static boolean hasUniqueChars(String str) {
		Set<Character> charSet = new HashSet<Character>();
		for (char c: str.toCharArray()) {
			if (charSet.contains(c)) {
				return false;
			}
			charSet.add(c);
		}
		return true;
	}
}
