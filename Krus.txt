import java.util.*;
public class Krus
{
    static int V = 5;
    static int[] parent = new int[V];
    static int INF = Integer.MAX_VALUE;
    static int find(int i)
    {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }
    static void union1(int i, int j)
    {
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }
    static void kruskalMST(int cost[][])
    {
        int mincost = 0; // Cost of min MST.
        for (int i = 0; i < V; i++)
            parent[i] = i;
            int edge_count = 0;
    while (edge_count < V - 1)
    {
        int min = INF, a = -1, b = -1;
        for (int i = 0; i < V; i++)
        {
            for (int j = 0; j < V; j++)
            {
                if (find(i) != find(j) && cost[i][j] < min)
                {
                    min = cost[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        union1(a, b);
        System.out.printf("Edge %d:(%d, %d) cost:%d \n",
        edge_count++, a, b, min);
        mincost += min;
    }
    System.out.printf("\n Minimum cost= %d \n", mincost);
}


public static void main(String[] args)
{
    int cost[][] = {
                    { INF, 2, INF, 6, INF },
                    { 2, INF, 3, 8, 5 },
                    { INF, 3, INF, INF, 7 },
                    { 10, 8, INF, INF, 9 },
                    { INF, 9, 7, 9, INF },
                   };
    System.out.println("The adjacency matrix with the costs of the edges for the graphis: ");
    for(int i=0;i<V;i++)
    {
        for(int j=0;j<V;j++)
        {
            if(cost[i][j] == INF) 
            {
                System.out.print(0+" ");
            }
            else
            {
                System.out.print(cost[i][j]+" ");
            }
        }
        System.out.println();
    }
    System.out.println("The number of nodes in the graph is : "+V);
    System.out.println("\n------------------------------------\n");
    System.out.println("\nThe edges along with the cost of the MST is : ");
        // Print the solution
    double startTime = System.nanoTime();
    kruskalMST(cost);
    double endTime = System.nanoTime();
    double totalTime = endTime - startTime;
    System.out.println("\nThe total time taken for Kruskals algorithm is :"+totalTime+" nano secs");
}
}
