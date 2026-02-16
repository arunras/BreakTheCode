package tree;

import java.util.Stack;

public class PostOrderTree {

  public void postOrderRecursive(TreeNode root) {
    if (root != null) {
      postOrderRecursive(root.left);
      postOrderRecursive(root.right);
      System.out.printf("%d ", root.data);
    }
  }

  public void postOrderIterative(TreeNode root) {
    if (root == null) 
      return;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode current = root;

    while (true) {
      if (current != null) {
        if (current.right != null)
          stack.push(current.right);
        stack.push(current);
        current = current.left;
        continue;
      }
      
      if (stack.isEmpty())
        return;

      current = stack.pop();

      if (current.right != null  && !stack.isEmpty() && current.right == stack.peek()) {
        stack.pop();
        stack.push(current);
        current = current.right;
      } else {
        System.out.printf("%d ", current.data);
        current = null;
      }
    }
  }

}
