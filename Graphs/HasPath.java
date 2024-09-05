package Graphs;

import java.util.ArrayList;

public class HasPath {
    
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


    /*    0 <----> 1
     *    |       /||
     *           / ||
     *          3 <-> 2-->4
     */

    public static boolean hasPath(ArrayList<Edge>[] graph ,int src ,int des , boolean isVisited[]){
        if(src == des){
            return true;
        }
        isVisited[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            if (!isVisited[e.des] && hasPath(graph, e.des, des, isVisited)) {
                return true;
            }
        }
        return false;
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

        boolean[] isVisited = new boolean[V];
 
        System.out.println(hasPath(graph, 0, 9, isVisited)); 
    }
}
