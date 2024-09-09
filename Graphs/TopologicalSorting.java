package Graphs;

import java.util.ArrayList;
import java.util.Stack;



public class TopologicalSorting {


    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int des, int wt) {
            this.src = src;
            this.dest = des;
            this.wt = wt;
        }
    }


    public static void topsort(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];

        Stack<Integer> s = new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topsortUtil(graph,i, vis, s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void topsortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s){
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topsortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);

    }

    public static void main(String[] args) {
        int V = 5;

        
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>(); 
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));
        // 1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 vertex

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        // graph[3].add(new Edge(3, 1, 3));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));



        System.out.println();
        // Call DFS starting from node 0
        System.out.print("DFS traversal starting from node 0:");
        topsort(graph); 
    }
}
