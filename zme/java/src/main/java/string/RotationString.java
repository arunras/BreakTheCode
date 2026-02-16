/*
 * Check Whether One String Is Rotation Of Another?
 */

package string;

public class RotationString {
	public static void rotate(String s1, String s2) {
		if (s1.length() != s2.length()) {
			System.out.println("s2 is not rotated version of s1");
		} else {
			String s3 = s1 + s1 + s1;
			if (s3.contains(s2)) {
				System.out.println("s2 is a rotated version of s1");
			} else {
				System.out.println("s2 is not a rotated version of s1");
			}
		}
	}
}
