// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
package leetcode.tree;

public class BSTPreorder {

  public static TreeNode bstFromPreorder(int[] preorder) {
    return buildBst(preorder, 0, preorder.length - 1);
  }

  private static TreeNode buildBst(int[] A, int start, int end) {
    if (start > end) return null;
    TreeNode node = new TreeNode(A[start]);
    int i = 0;
    for (i = start; i <= end; i++) {
      if (A[i] > node.val) break;
    }

    node.left = buildBst(A, start + 1, i - 1);
    node.right = buildBst(A, i, end);
    return node;
  }

}
