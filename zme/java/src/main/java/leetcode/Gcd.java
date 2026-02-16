package leetcode;

public class Gcd {
	
	public static int findGcd(int[] A) {
		int g = 0;
		
		for (int n : A) {
			g = gcd(g, n);
		}

		return g;
	}
	
	public static int gcd(int a, int b) {
		if (a == 0) return b;
		return gcd(b % a, a);
	}
	
}
