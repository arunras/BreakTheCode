package tree;

import java.util.Stack;

public class InOrderTree {
  
  public void inOrderRecursive(TreeNode root) {
    if (root != null) {
      inOrderRecursive(root.left);
        System.out.printf("%d ", root.data);
      inOrderRecursive(root.right);
    }
  }

  public void inOrderIterative(TreeNode root) {
    if (root == null)
      return;

    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode current = root;

    while (!stack.isEmpty() || current != null) {
      if (current != null) {
        stack.push(current);
        current = current.left;
      } else {
        TreeNode node = stack.pop();
        System.out.printf("%d ", node.data);
        current = node.right;
      }
    }
  }

}
