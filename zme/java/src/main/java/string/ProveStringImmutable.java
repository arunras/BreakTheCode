/*
 * Write a java program to prove that strings are immutable in java?
 */
package string;

public class ProveStringImmutable {
	
	public static void testLiteral() {
		String s1 = "JAVA";
		String s2 = "JAVA";
		System.out.println(s1 == s2);
		s1 = s1 + "J2EE";
		System.out.println(s1 == s2);
	}
	
	public static void newString() {
		String s1 = new String("JAVA");
		System.out.println(s1);
		
		s1.concat("J2EE");
		System.out.println(s1);
	}

}
