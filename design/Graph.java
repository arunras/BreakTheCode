import java.util.*;

/**
 * A Generic Graph implementation using an Adjacency List.
 * @param <T> The type of data stored in the vertices.
 */

public class Graph<T> {
  
  // Using a Map to store the adjacency list: Vertex -> List of Neighbors
  private final Map<T, List<T>> adjList;
  private final boolean isDirected;

  public Graph(boolean isDirected) {
    this.adjList = new HashMap<>();
    this.isDirected = isDirected;
  }

  // Adds a new vertex to the graph
  public void addVertex(T vertex) {
    adjList.putIfAbsent(vertex, new ArrayList<>());
  }

  // Adds an edge between two vertices
  public void addEdge(T source, T destination) {
    // Ensure both vertices exist in the graph
    if (!adjList.containsKey(source)) addVertex(source);
    if (!adjList.containsKey(destination)) addVertex(destination);

    adjList.get(source).add(destination);

    // If undirected, add the reverse edge as well
    if (!isDirected) {
      adjList.get(destination).add(source); 
    }
  }

  // Prints the adjacency list representation of the graph.
  public void printGraph() {
    for (T v : adjList.keySet()) {
      System.out.print(v + " -> ");
      System.out.println(adjList.get(v));
    }
  }

  // Performs a Breath-First Search (BFS) starting from a root node.
  public void bfs(T startNode) {
    Queue<T> q = new LinkedList<>();
    Set<T> visited = new HashSet<>();
    q.add(startNode);
    visited.add(startNode);

    System.out.print("BFS Traversal: ");
    while (!q.isEmpty()) {
      T vertex = q.poll();
      System.out.print(vertex + "->");

      for (T neighbor : adjList.getOrDefault(vertex, new ArrayList<>())) {
        if (!visited.contains(neighbor)) {
          visited.add(neighbor);
          q.add(neighbor);
        }
      }
    }
    System.out.println();
  }

  // TESTING
  public static void main(String[] args) {
    // Create an undirected graph of Strings (e.g., a Social Network)
    Graph<String> socialNetwork = new Graph<>(false);

    socialNetwork.addEdge("Alice", "Bob");
    socialNetwork.addEdge("Alice", "Charlies");
    socialNetwork.addEdge("Bob", "David");
    socialNetwork.addEdge("Charlies", "David");
    socialNetwork.addEdge("David", "Eve");

    System.out.println("--- Graph Structure ---");
    socialNetwork.printGraph();

    System.out.println("\n--- Traversal ---");
  }
}
