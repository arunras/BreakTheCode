package graph;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class DFS {
  // Node : Adjacency List
  private static class Node {
    private int data;
    private boolean visited;
    private List<Node> adjNodes;

    public Node(int data) {
      this.data = data;
      this.adjNodes = new ArrayList<Node>();
    }

    public void addAdjNode(Node node) {
      this.adjNodes.add(node);
    }

    public List<Node> getAdjNodes() {
      return this.adjNodes;
    }
  }

  // Iterative using Stack
  public void dfsStack(Node node) {
    Stack<Node> stack = new Stack<Node>();
    stack.push(node);
    while (!stack.isEmpty()) {
      Node currentNode = stack.pop();
      if (!currentNode.visited) {
        currentNode.visited = true;
        System.out.print(" > " + currentNode.data);
      }
      for(Node adjNode: currentNode.getAdjNodes()) {
        if (!adjNode.visited) {
          stack.push(adjNode);
        }
      }
    }
  }

  // Recursive DFS
  public void dfsRecursive(Node node) {
    System.out.print(" > " + node.data);
    node.visited = true;
    for (Node v: node.getAdjNodes()) {
      if (!v.visited) {
        dfsRecursive(v);
      }
    }
  }

  public static void main(String[] args) {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);
    Node node7 = new Node(7);
    Node node8 = new Node(8);
    Node node9 = new Node(9);
    Node node10 = new Node(10);
    Node node11 = new Node(11);
    Node node12 = new Node(12);

    node1.addAdjNode(node2);
    node1.addAdjNode(node7);
    node1.addAdjNode(node8);
    node2.addAdjNode(node3);
    node2.addAdjNode(node6);
    node3.addAdjNode(node4);
    node3.addAdjNode(node5);
    node8.addAdjNode(node9);
    node8.addAdjNode(node12);
    node9.addAdjNode(node10);
    node9.addAdjNode(node11);

    DFS dfs = new DFS();
    System.out.println("\nDFS Stack: ");
    dfs.dfsStack(node1);
    System.out.println();

    // Reset visited
    node1.visited = false;
    node2.visited = false;
    node3.visited = false;
    node4.visited = false;
    node5.visited = false;
    node6.visited = false;
    node7.visited = false;
    node8.visited = false;
    node9.visited = false;
    node10.visited = false;
    node11.visited = false;
    node12.visited = false;

    System.out.println("\nDFS Recursion: ");
    dfs.dfsRecursive(node1);
    System.out.println();
  }

}
