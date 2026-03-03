/*==BFS==*/

class BFS {

  /*--GRAPH--*/
  public void bfsGraph(Node root) {
    // 1. BFS Setup
    Queue<Node> q = new LinkedList<>();
    Set<Node> visited = new HashSet<>();
    q.add(root);
    visited.add(root);

    // 2. Traverse
    while (!root.isEmpty()) {
      Node node = q.poll();

      // Check neighbors
      for (Node neighbor : getNeighbors(node)) {
        if (visited.contains(neighbor) continue;
        q.add(neighbor);
        visited.add(neighbor);
      }
    }
  }

  /*--TREE--*/
  public TreeNode bfsTree(TreeNode root) {
    // 1. BFS Setup
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    // 2. Traverse
    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      if (isGoal(node)) return FOUND(node);

      // Check child
      if (node.left != null) q.add(node.left);
      if (node.right != null) q.add(node.right;
    }

    return NOT_FOUND;
  }

}
