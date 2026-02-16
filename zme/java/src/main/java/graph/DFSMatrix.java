package graph;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class DFSMatrix {

  private static class Node {
    private int data;
    private boolean visited;

    public Node(int data) {
      this.data = data;
    }
  }

  private static List<Node> nodes = new ArrayList<Node>();

  // Find adjNodes using Adjacency Matrix
  public List<Node> findAdjNodes(int[][] adjMatrix, Node node) {
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

  // Iterative DFS using stack
  public void dfsStack(int[][] adjMatrix, Node node) {
    Stack<Node> stack = new Stack<Node>();
    stack.push(node);
    while (!stack.isEmpty()) {
      Node currentNode = stack.pop();
      if (!currentNode.visited) {
        currentNode.visited = true;
        System.out.print(" > " + currentNode.data);
      }
      List<Node> adjNodes = findAdjNodes(adjMatrix, currentNode);
      for (Node v: adjNodes) {
        if (!v.visited) {
          stack.add(v);
        }
      }
    }
  }

  // Recursive DFS
  public void dfsRecursive(int[][] adjMatrix, Node node) {
    System.out.print(" > " + node.data);
    node.visited = true;
    List<Node> adjNodes = findAdjNodes(adjMatrix, node);
    for (Node v: adjNodes) {
      if (!v.visited) {
        dfsRecursive(adjMatrix, v);
      }
    }
  }
  
  public static void clearVisited() {
    for(Node v: nodes) {
      v.visited = false;
    }
  }


  public static void main(String arg[]) {
    for (int i = 0; i <= 12; i++) {
      nodes.add(new Node(i));
    }
    
    int adjacency_matrix[][] = {
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
      {0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };
    DFSMatrix dfs = new DFSMatrix();
    System.out.println("\nDFS Stack: ");
    dfs.dfsStack(adjacency_matrix, nodes.get(8));
    System.out.println();

    clearVisited();

    System.out.println("\nDFS Recursive: ");
    dfs.dfsRecursive(adjacency_matrix, nodes.get(1));
    System.out.println();
  }

}

