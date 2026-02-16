package idsa;

public class TowerOfHanoi {
  private static int numOfMoves = 0;
  public void move(int numOfDiscs, char fromA, char toC, char interB) {
    if (numOfDiscs == 1) {
      System.out.println(numOfMoves + ". Moving disc " + numOfDiscs + " fromA " + fromA + " to " + toC);
      numOfMoves++;
    } else {
      move(numOfDiscs - 1, fromA, interB, toC);
      System.out.println(numOfMoves + ". Moving disc " + numOfDiscs + " fromA " + fromA + " to " + toC);
      numOfMoves++;
      move(numOfDiscs - 1, interB, toC, fromA);
    }
  }

  public static void main(String[] args) {
    TowerOfHanoi toh = new TowerOfHanoi();
    toh.move(3, 'A', 'C', 'B');
    System.out.println("Number of Moves: " + numOfMoves);
  }
}
