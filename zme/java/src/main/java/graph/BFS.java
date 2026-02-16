package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
  private static List<Node> nodes = new ArrayList<Node>();
  private Queue<Node> queue;

  public static class Node {
    private int data;
    private boolean visited;
    private List<Node> neighbours;

    public Node(int data) {
      this.data = data;
      this.neighbours = new ArrayList<Node>();
    }

    private void addNeighbour(Node neighbour) {
      this.neighbours.add(neighbour);
    }

    private List<Node> getNeighbours() {
      return this.neighbours; 
    }

    private void setNeighbours(List<Node> neighbours) {
      this.neighbours = neighbours;
    }
  }

  public BFS() {
    this.queue = new LinkedList<Node>();
  }

  private void bfsTraverse(Node node) {
    this.queue.add(node);
    node.visited = true;  
    while (!this.queue.isEmpty()) {
      Node dQueue = queue.remove();
      System.out.print(" > " + dQueue.data);
      List<Node> neighbours = dQueue.getNeighbours();
      for (int i = 0; i < neighbours.size(); i++) {
        Node n = neighbours.get(i);
        if (n != null && !n.visited) {
          this.queue.add(n);
          n.visited = true;
        }
      }
    }
  }
  
  public static void main(String[] args) {
    Node node40 = new Node(40);		
    Node node10 = new Node(10);		
    Node node20 = new Node(20);		
    Node node30 = new Node(30);		
    Node node60 = new Node(60);		
    Node node50 = new Node(50);		
    Node node70 = new Node(70);		
   
    node40.addNeighbour(node10);		
    node40.addNeighbour(node20);		
    node10.addNeighbour(node30);		
    node20.addNeighbour(node10);		
    node20.addNeighbour(node30);		
    node20.addNeighbour(node60);		
    node20.addNeighbour(node50);		
    node30.addNeighbour(node60);		
    node60.addNeighbour(node70);		
    node50.addNeighbour(node70);		
   
    System.out.println("\nBFS Recursion: ");		
    BFS bfs = new BFS();		
    bfs.bfsTraverse(node40);	
    
    System.out.println("\n");
  }

}

