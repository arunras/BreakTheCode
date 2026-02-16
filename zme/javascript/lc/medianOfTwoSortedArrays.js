/* There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 * Example 1: nums1 = [1, 3] nums2 = [2] The median is 2.0
 * Example 2: nums1 = [1, 2] nums2 = [3, 4] The median is (2 + 3)/2 = 2.5
 */

var findMedianSortedArrays = function(A, B) {
  var x = A.length;
  var y = B.length;
  if (x > y) {
    var z = x, x = y, y = z;
    var C = A, A = B, B = C;
  }
  
  var iMin = 0;
  var iMax = x;

  var i; //partitionX;
  var j; //partitionY;
  var halfLen = (x + y + 1) / 2;

  var maxLeftX, maxLeftY;
  var minRightX, minRightY;

  while (iMin <= iMax) {
    i = parseInt((iMin + iMax) / 2);
    j = parseInt(halfLen - i);

    maxLeftX = (i == 0) ? Number.MIN_VALUE : A[i - 1];
    minRightX = (i == x) ? Number.MAX_VALUE : A[i];

    maxLeftY = (j == 0) ? Number.MIN_VALUE : B[j - 1];
    minRightY = (j == y) ? Number.MAX_VALUE : B[j];

    if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
      if ((x + y) % 2 == 0) {
        return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
      } else {
        return Math.max(maxLeftX, maxLeftY);
      }
    } else if (maxLeftX > minRightY) {
      iMax = i - 1;
    } else {
      iMin = i + 1;
    }
  }
  return 0;
}

var A = [1, 2];
var B = [3, 4];
console.log("Answer: " + findMedianSortedArrays(A, B));









