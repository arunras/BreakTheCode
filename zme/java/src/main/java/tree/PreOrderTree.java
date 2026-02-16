package tree;

import java.util.Stack;

public class PreOrderTree {

  public void preorderRecursive(TreeNode root) {
    if (root != null) {
      System.out.printf("%d ", root.data);
      preorderRecursive(root.left);
      preorderRecursive(root.right);
    }
  }

  public void preorderIterative(TreeNode root) {
    if (root == null)
     return; 

    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push(root); 
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      System.out.printf("%d ", node.data);
      
      if (node.right != null)
        stack.push(node.right);
      if (node.left != null) 
        stack.push(node.left);
    }
  }

}
