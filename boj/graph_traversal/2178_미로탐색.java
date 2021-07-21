import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[][] map;
    public static boolean[][] visited;
    public static int n, m;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();

        StringTokenizer st = new StringTokenizer(temp);

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs();

        System.out.println(map[n-1][m-1]);
        br.close();
    }

    public static void bfs() {
        Queue<Position> q = new LinkedList<>();
        q.offer(new Position(0, 0));
        visited[0][0] = true;

        while (!q.isEmpty()) {
            Position position = q.poll();
            for (int i = 0; i < 4; i++) {
                int cx = position.x + dx[i];
                int cy = position.y + dy[i];
                if (cx >= 0 && cx < n && cy >= 0 && cy < m) {
                    if (map[cx][cy] == 0 || visited[cx][cy]) continue;

                    q.offer(new Position(cx, cy));
                    visited[cx][cy] = true;
                    map[cx][cy] = map[position.x][position.y] + 1;
                }
            }
        }
    }
}

class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
