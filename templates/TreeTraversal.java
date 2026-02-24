/*==TREE TRAVERSAL==*/

class TreeTraversal {
  /*-Output Vars-*/
  List<Integer> list = new ArrayList<>();

  /*==Preorder: Node->Left->Right ==*/
  public void preorder(TreeNode node) {
    if (node == null) return;

    list.add(node.val);
    preorder(node.left);
    preorder(node.right);
  }

  /*==Inorder: Left->Node->Right ==*/
  public void inorder(TreeNode node) {
    if (node == null) return;

    inorder(node.left);
    list.add(node.val);
    inorder(node.right);
  }

  /*==Postorder: Left->Right->Node ==*/
  public void postorder(TreeNode node) {
    if (node == null) return;

    postorder(node.left);
    postorder(node.right);
    list.add(node.val);
  }

}
