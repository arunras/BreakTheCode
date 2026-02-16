/*implement two stacks in a single array */

package stack;

public class TwoStacks {
	int size;
	int top1;
	int top2;
	int arr[];
	
	//Constructor
	public TwoStacks(int n) {
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}
	
	public void push1(int x) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = x;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	
	public void push2(int x) {
		if (top2 > top1 + 1) {
			top2--;
			arr[top2] = x;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	
	public int pop1() {
		if (top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public int pop2() {
		if (top2 < size) {
			int x = arr[top2];
			top2++;
			return x;
		} else {
			System.out.println("System Underflow");
			System.exit(1);
		}
		return 0;
	}
}
