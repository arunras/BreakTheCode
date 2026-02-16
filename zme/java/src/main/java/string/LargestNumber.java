/*
 * Write a java program to find the largest number ‘L’ less than a given number ‘N’ which should not 
 * contain a given digit ‘D’. For example, If 145 is the given number and 4 is the given digit, 
 * then you should find the largest number less than 145 such that it should not contain 4 in it. 
 * In this case, 139 will be the answer.
 */
package string;

public class LargestNumber {

	public static int getLLessThanN(int number, int digit) {
		// converting digit to char
		char c = Integer.toString(digit).charAt(0);
		
		// Decrementing number and check whether it contains digit
		int indexC;
		for (int i = number; i > 0; i--) {
			indexC = Integer.toString(i).indexOf(c);
			//System.out.println(indexC);
			if (indexC == -1) {
				return i;
			}
		}
		return -1;
	}
}
