package recursion;

public class TowerOfAngkor {
  static int order = 0;
  
  public static void tower(int n, char start, char end, char middle) {
    if (n == 1)
      System.out.println(++order + "> Move " + n + " from " + start + " to " + end);
    else {
      tower(n - 1, start, middle, end);
      System.out.println(++order + "> Move " + n + " from " + start + " to " + end);
      tower(n - 1, middle, end, start);
    }
  }  
}
