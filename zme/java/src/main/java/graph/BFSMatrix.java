package graph;

import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BFSMatrix {
  private static class Node {
    private int data;
    private boolean visited;

    public Node(int data) {
      this.data = data;
    }
  }  

  private static List<Node> nodes = new ArrayList<Node>();

  public List<Node> getAdjNodes(int[][] adjMatrix, Node node) {
    List<Node> adjNodes = new ArrayList<Node>();
    
    for (int i = 0; i < nodes.size(); i++) {
      if (nodes.get(i).equals(node)) {
        for (int j = 0; j < adjMatrix[i].length; j++) {
          if (adjMatrix[i][j] == 1) {
            adjNodes.add(nodes.get(j));
          }
        }
        break;
      }
    }
    return adjNodes;
  }

  public void bfs(int[][] adjMatrix, Node node) {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(node);
    node.visited = true;
    while (!queue.isEmpty()) {
      Node currentNode = queue.remove();
      System.out.print(" > " + currentNode.data);
      List<Node> adjNodes = getAdjNodes(adjMatrix, currentNode);
      for (Node v: adjNodes) {
        if (!v.visited) {
          queue.add(v);
          v.visited = true;
        }
      }
    }
  }

  public static void main(String[] args) {
    Node node0 = new Node(0);
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

    nodes.add(node0);
    nodes.add(node1);
    nodes.add(node2);
    nodes.add(node3);
    nodes.add(node4);
    nodes.add(node5);
    nodes.add(node6);
    nodes.add(node7);
    nodes.add(node8);
    nodes.add(node9);
    nodes.add(node10);
    nodes.add(node11);
    nodes.add(node12);

    int[][] adjMatrix = {
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };

    System.out.println("\nBFS Traversal: ");
    BFSMatrix bfs = new BFSMatrix();
    bfs.bfs(adjMatrix, node1);

    System.out.println();
  }

}
