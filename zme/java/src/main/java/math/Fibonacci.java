package math;

/**
 * Write a function int fib(int n) that returns Fn. 
 * For example, if n = 0, then fib() should return 0. If n = 1, then it should return 1. 
 * For n > 1, it should return Fn-1 + Fn-2
 */

public class Fibonacci {
	
	// Recursive, Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.
	public static int fibRecursive(int n) {
		if (n < 2) return 1;
		return fibRecursive(n - 1) + fibRecursive(n - 2);
	}
	
	// Dynamic Programming, Time Complexity: O(n), Extra Space: O(n)
	public static int fibDp(int n) {
		int[] f = new int[n + 2];
		f[0] = f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}
	
	// Space Optimized Method, Time Complexity: O(n), Extra Space: O(1)
	public static int fibOpimized(int n) {
		int a = 1, b = 1, c;
		if (n < 2) return a;
		for (int i = 2; i <= n; i++) {
			c = b + a;
			a = b;
			b = c;
		}
		return b;
	}
	
}
