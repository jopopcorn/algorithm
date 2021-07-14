import java.util.*;

public class Main{
    public static boolean[] visited;
    public static int[][] graph;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pair = sc.nextInt();

        visited = new boolean[n+1];
        graph = new int[n+1][n+1];

        for(int i=0; i<pair; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        bfs(1);
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        visited[start] = true;

        int count = 0;

        while(!q.isEmpty()){
            int x = q.poll();

            for(int i=0; i<graph.length; i++){
                if(visited[i] || graph[x][i] == 0) continue;
                q.offer(i);
                visited[i] = true;
                count++;
            }
        }

        System.out.println(count);
    }
}
