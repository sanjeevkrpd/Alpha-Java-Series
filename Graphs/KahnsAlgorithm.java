package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnsAlgorithm {

    // Edge class representing an edge in the graph
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // Calculate in-degree of each vertex
    public static void calcInDeg(ArrayList<Edge>[] graph, int[] indeg) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }

    // Kahn's Algorithm for Topological Sorting
    public static void topSort(ArrayList<Edge>[] graph) {
        int[] indeg = new int[graph.length];

        // Calculate in-degrees
        calcInDeg(graph, indeg);

        // Queue to store vertices with 0 in-degree
        Queue<Integer> q = new LinkedList<>();

        // Add vertices with 0 in-degree to the queue
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        // Process the graph
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>(); 
        }

        // Creating a valid Directed Acyclic Graph (DAG)
        graph[0].add(new Edge(0, 2, 1));  // 0 -> 2
        graph[0].add(new Edge(0, 3, 1));  // 0 -> 3
        graph[1].add(new Edge(1, 3, 1));  // 1 -> 3
        graph[1].add(new Edge(1, 4, 1));  // 1 -> 4
        graph[2].add(new Edge(2, 4, 1));  // 2 -> 4
        graph[3].add(new Edge(3, 5, 1));  // 3 -> 5
        graph[4].add(new Edge(4, 5, 1));  // 4 -> 5

        // Run Kahn's algorithm to print the topological order
        topSort(graph);
    }
}
