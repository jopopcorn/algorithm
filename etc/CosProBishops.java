class Main {
    public static int[] dx = {-1, -1, 1, 1}; // 왼위, 오위, 왼아, 오아
    public static int[] dy = {-1, 1, -1, 1}; // 왼위, 오위, 왼아, 오아
    public static boolean[][] visited;

    public int solution(String[] bishops) {
        int answer = 64;
        visited = new boolean[8][8];

        for (int i = 0; i < bishops.length; i++) {
            int x = bishops[i].charAt(1) - '0' - 1;
            int y = bishops[i].charAt(0) - 'A';
            visited[x][y] = true;

            int direction = 0;
            while (direction < 4) {
                int cx = x + dx[direction];
                int cy = y + dy[direction];

                while (cx >= 0 && cy >= 0 && cx < 8 && cy < 8) {
                    visited[cx][cy] = true;
                    cx += dx[direction];
                    cy += dy[direction];
                }

                direction++;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (visited[i][j]) {
                    answer -= 1;
                }
            }
        }

        return answer;
    }
}
