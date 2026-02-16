package recursion;

public class Power {

  public static float power(int x, int n) {
    if (n == 0) 
      return 1;
    else {
      if (n % 2 == 0)
        return power(x, n/2) * power(x, n/2);
      else if (n % 2 > 0)
        return x * power(x, n - 1);
      else if (n % 2 < 0)
        return (1 / power(x, -n));
    }
    return 1;
  }

}
