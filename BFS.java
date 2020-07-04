import java.util.*;
public class BFS{
        static int n;
        static int[][] graph=new int[100][100];
        static int[] visited=new int[100];
        static int[] queue=new int[100];
        static int front=0,rear=0;
        static void addq(int ele){
                queue[rear++]=ele;
        }
        static int deleteq(){
                if(front>=rear){
                        System.out.println("end of program");
                        System.exit(0);
                }
                return queue[front++];
        }

        static void bfs(){
                int node;
                node=deleteq();
                if(visited[node]==0){
                visited[node]=1;
                System.out.print(node+"  ");
                for(int i=0;i<n;i++){
                        if(graph[node][i]==1 && visited[i]==0){
                                addq(i);
                        }
                }}
                bfs();
        }
        public static void main(String args[]){
                System.out.println("how many vertices");
                Scanner sc=new Scanner(System.in);
                n=sc.nextInt();
                for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                                graph[i][j]=0;
                                visited[i]=0;
                        }
                }
                System.out.println("how many edges");
                int e;
                e=sc.nextInt();
                int a,b;
                for(int i=0;i<e;i++){
                        System.out.println("enter edge a b");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        graph[a][b]=1;graph[b][a]=1;
                }
                System.out.println("bfs traversal");
                addq(1);
                bfs();
                System.out.println();
        }
}

