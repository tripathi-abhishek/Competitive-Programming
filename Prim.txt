import java.util.*;
import java.lang.*;
import java.io.*;

public class Prim
{
    private static final int V = 6;
    int minKey(int key[], Boolean mstSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;
        for (int v = 0; v < V; v++)
        if (mstSet[v] == false && key[v] < min) 
        {
            min = key[v];
            min_index = v;
        }
        return min_index;
    }
    
    
    void printMST(int parent[], int graph[][])
    {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }
    
    
    void primMST(int graph[][])
    {
        int parent[] = new int[V];
        int key[] = new int[V];
        Boolean mstSet[] = new Boolean[V];
        for (int i = 0; i < V; i++) 
        {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
        key[0] = 0;
        parent[0] = -1;
        for (int count = 0; count < V - 1; count++) 
        {
            int u = minKey(key, mstSet);
            mstSet[u] = true;
            for (int v = 0; v < V; v++)
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) 
                {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }
            printMST(parent, graph);
    }
    
    
public static void main(String[] args)
{
    Prim t = new Prim();
    int graph[][] = new int[][] { { 0, 3, 0, 8, 0, 4},
                                  { 2, 0, 3, 8, 5, 0},
                                  { 0, 3, 0, 0, 7, 8},
                                  { 6, 8, 0, 7, 9, 0},
                                  { 0, 5, 7, 9, 0, 0},
                                  { 4, 0, 8, 0, 0, 0} };
    System.out.println("The adjacency matrix of the graph is: ");
    for(int i=0;i<V;i++)
    {
        for(int j=0;j<V;j++)
        {
            System.out.print(graph[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("The number of nodes is "+V+"\n--------------------------------\n");
    System.out.println("\nThe edges along with the corresponding weights of thefinal MST after applying Prims algorithm is: ");
    double startTime = System.nanoTime();
    t.primMST(graph);
    double endTime = System.nanoTime();
    double totalTime = endTime - startTime;
    System.out.println("Total time taken = " + totalTime + " nano secs");
}
}
