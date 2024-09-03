package Graphs;
import java.util.*;

public class Classroom {

    static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    // breadth first search;

    
    public static void bfs(ArrayList<Edge>[] graph){
        
        Queue<Integer> q = new LinkedList<>();

        boolean vis[] = new boolean[graph.length];

        //source
        q.add(0);

        while (!q.isEmpty()) {
            
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    
                    Edge e = graph[curr].get(i);

                    q.add(e.des);
                }
            }

        }


    }

    // depth first search


    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.des]) {
                dfs(graph, e.des, vis);
            }
        }
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

        // bfs(graph);
        boolean[] vis = new boolean[V];

        // Call DFS starting from node 0
        System.out.println("DFS traversal starting from node 0:");
        dfs(graph, 0, vis);

    }


}
