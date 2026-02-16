package tree;

import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTree {
  
  public void levelOrder(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      System.out.printf("%d ", node.data);
      if (node.left != null)
        q.add(node.left);
      if (node.right != null)
        q.add(node.right);
    }
  }

}
