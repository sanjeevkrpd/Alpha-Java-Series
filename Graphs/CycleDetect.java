package Graphs;

import java.util.ArrayList;

public class CycleDetect {

    static class Edge {
        int src;
        int dest; 

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length]; 

  
        for (int i = 0; i < graph.length; i++) {
           
            if (!vis[i]) {
                if (detectCycleUntil(graph, vis, i, -1)) {
                    return true; // If a cycle is detected, return true
                }
            }
        }
        return false; // No cycle detected, return false
    }

    public static boolean detectCycleUntil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int parent) {
        vis[curr] = true; 

    
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

           
            if (!vis[e.dest]) {
                if (detectCycleUntil(graph, vis, e.dest, curr)) {
                    return true; 
                }
            } 
           
            else if (e.dest != parent) {
                return true; 
            }
        }
        return false; 
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

        System.out.println(detectCycle(graph));
    }
}
