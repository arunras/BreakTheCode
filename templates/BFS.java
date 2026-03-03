/*==BFS==*/

class BFS {

  /*--BFS GRAPH--*/
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

}
