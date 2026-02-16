package idsa;

public class FactorialCalculator {
  
  public static long factorial(long n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }
  
  public static long factorialRecursive(long n) {
    if (n == 1) return 1;	
    return n * factorialRecursive(n-1);
  }

  public static void main(String[] args) {
    long n = 10;
    System.out.println("Factorial of " + n + " is " + factorialRecursive(n));
  }
}
