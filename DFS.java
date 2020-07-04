import java.util.Scanner;

public class dfs {
    public static void main(String args[]) {
        System.out.println("how many vertices?");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = 0;
                visited[i] = 0;
            }
        }
        System.out.println("how many edges ?");
        int e;
        e = sc.nextInt();
        int a, b;
        for (int i = 0; i < e; i++) {
            System.out.println("enter edge vertices a and b");
            a = sc.nextInt();
            b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        System.out.println("adjacency matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("dfs traversal");
        dfs_traversal(1);
        System.out.println();
    }

    static int n;
    static int[][] graph = new int[100][100];
    static int[] visited = new int[100];

    static void dfs_traversal(int source) {
        System.out.print(source + "  ");
        visited[source] = 1;
        for (int i = 0; i < n; i++) {
            if (graph[source][i] == 1) {
                if (visited[i] == 0) {
                    dfs_traversal(i);
                }
            }
        }
    }

}