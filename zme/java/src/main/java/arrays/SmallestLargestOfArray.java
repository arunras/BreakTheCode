package arrays;

public class SmallestLargestOfArray {

  public static int[] findNumbers(int[] arr) {
    int[] result = new int[2];
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      smallest = (arr[i] < smallest) ? arr[i] : smallest;  
      largest = (arr[i] > largest) ? arr[i] : largest;
    }
    result[0] = smallest;
    result[1] = largest;
    return result;
  }

}
