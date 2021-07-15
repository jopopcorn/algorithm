import java.util.*;

public class Main{
    public static int[][] map;
    public static boolean[][] visited;
    public static int n;
    public static ArrayList<Integer> result = new ArrayList<>();
    public static final int[] dx = {0, 1, 0, -1};
    public static final int[] dy = {1, 0, -1, 0};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            String columns = sc.next();
            for(int j=0; j<n; j++){
                map[i][j] = columns.charAt(j) - '0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 0 || visited[i][j]) continue;
                bfs(i, j);
            }
        }

        System.out.println(result.size());

        Collections.sort(result);

        for (Integer apart : result) {
            System.out.println(apart);
        }
    }

    public static void bfs(int x, int y){
        Queue<Position> q = new LinkedList<>();
        q.offer(new Position(x, y));
        visited[x][y] = true;

        int count = 0;

        while(!q.isEmpty()){
            Position position = q.poll();
            for(int i=0; i<4; i++){
                int cx = position.x + dx[i];
                int cy = position.y + dy[i];
                if(cx >= 0 && cx < n && cy >= 0 && cy < n){
                    if(map[cx][cy] == 0 || visited[cx][cy]) continue;
                    q.offer(new Position(cx, cy));
                    visited[cx][cy] = true;
                    count++;
                }
            }
        }

        result.add(count);
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
