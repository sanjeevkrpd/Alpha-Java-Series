package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BfsAndDfs {

    static class Edge{
        int src;
        int des;
        int wt;
        public Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }

        

    }
    public static void bfs(ArrayList<Edge> graph[]){

        int V = graph.length;
        boolean visited[] = new boolean[V];

        for (int i = 0; i < graph.length; i++) {
            
            if (!visited[i]) {
                bfsUtil(graph , visited);

            }
        }
    }

    public static void bfsUtil(ArrayList<Edge> graph[] , boolean vis[]){

        Queue<Integer> q = new LinkedList<>();

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

    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {

            dfsUtil(graph , i , vis);
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[] , int curr , boolean vis[]){

        System.out.print(curr+" ");

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            
            Edge e = graph[curr].get(i);

            if (!vis[e.des]) {
                
                dfsUtil(graph, e.des, vis);
            }
        }
    }



    public static void main(String[] args) {
        
    }
}
