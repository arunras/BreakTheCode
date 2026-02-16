package arrays;

public class BinarySearch {

  public static int primeSearch(int[] primes, int target) {
    int min = 0;
    int max = primes.length - 1;
    while (min < primes.length) {
      if (max < min) return -1; 
      int guess = (min + max) / 2;
      if (primes[guess] == target) return guess;
      else if (primes[guess] < target) min = guess + 1;
      else if (primes[guess] > target) max = guess - 1;
    } 
    return -1;
  }

}
