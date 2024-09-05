package Graphs;

import java.util.ArrayList;

public class CycleDetect {

    static class Edge {
        int src;
        int dest; // Corrected to 'dest' for destination

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length]; // Visited array to mark visited nodes

        // Traverse all nodes, ensuring each component is checked for a cycle
        for (int i = 0; i < graph.length; i++) {
            // If the node is not visited, start a DFS from this node
            if (!vis[i]) {
                if (detectCycleUntil(graph, vis, i, -1)) {
                    return true; // If a cycle is detected, return true
                }
            }
        }
        return false; // No cycle detected, return false
    }

    public static boolean detectCycleUntil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true; // Mark the current node as visited

        // Traverse through all edges of the current node
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // If the adjacent node is not visited, recursively check for a cycle
            if (!vis[e.dest]) {
                if (detectCycleUntil(graph, vis, e.dest, curr)) {
                    return true; // Cycle detected in the recursive call
                }
            } 
            // If the adjacent node is visited and is not the parent, it means a cycle exists
            else if (e.dest != parent) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle found in this DFS path
    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 5));
        // graph[5].add(new Edge(5, 6)); // Removed since vertex 6 does not exist in a graph of size 6

        // Output if cycle is detected or not
        System.out.println(detectCycle(graph));
    }
}
