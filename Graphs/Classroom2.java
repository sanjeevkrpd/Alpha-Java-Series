package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Classroom2 {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src , int dest , int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }



    public static void dfs(ArrayList<Edge> graph[] , int src , boolean[] vis){

        vis[src] = true;
        System.out.print(src + " ");
                       
         for (int i = 0; i < graph[src].size(); i++) { 
            Edge e = graph[src].get(i);
            if (!vis[e.dest]) {       
                dfs(graph, e.dest, vis);
            }
         }
    }
        /*  create this graph 
                0 -- 1 - 2
         *     / \      / 
         *    4 - 5 --- 6
         */


         public static boolean hasPath(ArrayList<Edge> graph[] , int src , int des , boolean vis[]){

                if (src == des) {
                    return true;
                }

                vis[src] = true;
                
                for (int i = 0; i < graph[src].size(); i++) {
                   Edge e = graph[src].get(i);
                   
                   if (!vis[e.dest] && hasPath(graph, e.dest, des, vis)) {
                        return true;
                   }
                }
                return false;

         }
 

    public static void bfs(ArrayList<Edge> graph[]){

        boolean  vis[] = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();

        // adding src
        q.add(0);

        while (!q.isEmpty()) {
            
            int curr = q.remove();

                if (!vis[curr]) {
                    System.out.print(curr+ " ");
                    vis[curr] = true;
                    
                    for (int i = 0; i < graph[curr].size(); i++) {
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
        }
    }


    public static void main(String[] args) {
        
        /*    create this graph 
                0 -- 1 - 2
         *     / \      / 
         *    4 - 5 --- 6
         */

         int V = 7;

         @SuppressWarnings("unchecked")
         ArrayList<Edge> graph[]  = new ArrayList[V];

         for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
         }

         
         // 0 Vertex
         graph[0].add(new Edge(0, 1, 1));
         graph[0].add(new Edge(0, 4, 1));
         graph[0].add(new Edge(0, 5, 1));

         // 1 vertex
         graph[1].add(new Edge(1, 2, 1));
         graph[1].add(new Edge(1, 0, 1));
         // 2 vertex
         graph[2].add(new Edge(2, 6, 1));
         graph[2].add(new Edge(2, 1, 1));
         // 4 vertex
         graph[4].add(new Edge(4, 5, 1));
         graph[4].add(new Edge(4, 0, 1));
         
         // 5 vertex
         graph[5].add(new Edge(5, 0, 1));
         graph[5].add(new Edge(5, 4, 1));
         graph[5].add(new Edge(5, 6, 1));


         System.out.println("Graph Created Successfully");

         boolean vis[] = new boolean[V];
         
         System.out.println("Dfs :- ");
         dfs(graph, 0, vis);

         System.out.println();

       dfs2(graph);
        // System.out.println("Bfs :- ");
        //  bfs(graph);
        // s bfs2(graph);
        //  System.out.println();
        //  boolean vis1[] = new boolean[V];
        //  System.out.println(hasPath(graph, 0, 6, vis1));
    }


    public static void bfs2(ArrayList<Edge> graph[] ){

        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            
            if (!vis[i]) {
                bfsUtil(graph , vis);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge> graph[] , boolean vis[] ){

        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while (!q.isEmpty()) {
            
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    
                    Edge e = graph[curr].get(i);

                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs2(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i] && !graph[i].isEmpty()) {
                dfsUtil(graph , i , vis);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge> graph[] , int curr , boolean vis[]){

        System.out.print(curr+" ");

        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                
                dfsUtil(graph, e.dest, vis);
            }   
        }
    }
}
