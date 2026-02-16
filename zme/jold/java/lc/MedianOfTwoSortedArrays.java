/* Median of Two Sorted Arrays
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. 
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 * Example 1: nums1 = [1, 3] nums2 = [2] The median is 2.0 
 * Example 2: nums1 = [1, 2] nums2 = [3, 4] The median is (2 + 3)/2 = 2.5
 */

package lc;

public class MedianOfTwoSortedArrays {
  public double findMedianSortedArrays(int[] A, int[] B) { 
    int m = A.length;
    int n = B.length;
    if (m > n) {
      return findMedianSortedArrays(B, A);
    }
    int iMin = 0;
    int iMax = m;
    int i; //partitionX, 
    int j; //partionY;
    int halfLen = (m + n + 1) / 2; 
    int maxLeftX, maxLeftY;
    int minRightX, minRightY;

    while (iMin <= iMax) {
      i  = (iMin + iMax) / 2;
      j  = halfLen - i;
      //if partionX is 0, means there is no elements on left side. maxLeftX = -INF
      //if partionY is y, means there is no elements on right side. minRightY = +INF
      maxLeftX = (i == 0) ? Integer.MIN_VALUE : A[i - 1];
      minRightX = (i == m) ? Integer.MAX_VALUE : A[i];
      maxLeftY = (j == 0) ? Integer.MIN_VALUE : B[j - 1];
      minRightY = (j == n) ? Integer.MAX_VALUE : B[j];
      if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
        if ((m + n) % 2 == 0) {
          return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
        } else {
          return (double) Math.max(maxLeftX, maxLeftY);
        }
      } else if (maxLeftX > minRightY) {
        iMax = i - 1;
      } else {
        iMin = i + 1;
      }
    }
    throw new IllegalArgumentException ("Input is not currect");
  }

  public static void main(String[] args) {
    MedianOfTwoSortedArrays md = new MedianOfTwoSortedArrays();
    int[] A = new int[] {3, 4};
    int[] B = new int[] {1, 2, 5, 7, 8, 9};    
  
    System.out.println("Median is: " + md.findMedianSortedArrays(A, B));
  }
}

