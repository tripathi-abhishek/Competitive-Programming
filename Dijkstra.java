import java.util.*;
import java.lang.*;
import java.io.*;

public class Dijkstra 
{
    static final int V = 9;
    int minDistance(int dist[], Boolean sptSet[])
        {
            int min = Integer.MAX_VALUE, min_index = -1;
            for (int v = 0; v < V; v++)
                if (sptSet[v] == false && dist[v] <= min) 
                {
                    min = dist[v];
                    min_index = v;
                }
            return min_index;
        }
        
        
    void printSolution(int dist[], int n)
    {
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t" + dist[i]);
    }
    
    
    void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];
        for (int i = 0; i < V; i++) 
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        for (int count = 0; count < V - 1; count++) 
        {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < V; v++)
                if (!sptSet[v] && graph[u][v] != 0 &&dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
        printSolution(dist, V);
    }
public static void main(String[] args)
{
    int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                  { 4, 0, 8, 0, 0, 0, 0, 7, 0 },
                                  { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                  { 0, 0, 7, 0, 9, 1, 0, 0, 0 },
                                  { 0, 0, 0, 9, 0, 9, 0, 0, 0 },
                                  { 0, 1, 4, 4, 1, 0, 2, 0, 0 },
                                  { 0, 0, 3, 0, 0, 2, 0, 1, 6 },
                                  { 8, 1, 0, 0, 0, 0, 1, 0, 7 },
                                  { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
    System.out.println("The adjacency matrix of the cost of the edges of the graph is:");
    for(int i=0;i<V;i++)
    {
        for(int j=0;j<V;j++)
        {
            System.out.print(graph[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The number of nodes is "+V+"\n--------------------------\n");
    System.out.println("\nThe source node is: "+ 0);
    System.out.println("The shortest distances from the source node to all the vertices using Djikstra's algorithm is: ");
    Dijkstra t = new Dijkstra();
    t.dijkstra(graph, 0);
}
}
