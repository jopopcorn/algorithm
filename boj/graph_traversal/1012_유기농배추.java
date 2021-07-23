import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static int t;
    public static int m, n, k;
    public static int count;
    public static boolean[][] visited;
    public static int[][] map;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void bfs(int x, int y){
        Queue<Position> q = new LinkedList<>();
        q.offer(new Position(x, y));
        visited[x][y] = true;

        while(!q.isEmpty()){
            Position position = q.poll();

            for(int i=0; i<4; i++){
                int cx = position.x + dx[i];
                int cy = position.y + dy[i];

                if(cx >= 0 && cy >= 0 && cx < m && cy < n){
                    if(visited[cx][cy] || map[cx][cy] == 0) continue;
                    q.offer(new Position(cx, cy));
                    visited[cx][cy] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for(int testCase = 0; testCase < t; testCase++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            count = 0;
            map = new int[m][n];
            visited = new boolean[m][n];

            for(int i=0; i<k; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }

            if(k == 1){
                System.out.println(1);
            }else{
                for(int i=0; i<m; i++){
                    for(int j=0; j<n; j++){
                        if(visited[i][j] || map[i][j] == 0) continue;
                        bfs(i, j);
                        count++;
                    }
                }
                System.out.println(count);
            }
        }

        br.close();
    }
}

class Position{
    int x;
    int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
}
