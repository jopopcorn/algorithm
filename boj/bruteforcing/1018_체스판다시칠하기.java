import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static int[][] chess;
    public static int min = 64;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        chess = new int[n][m];

        for(int i=0; i<n; i++){
            char[] temp = br.readLine().toCharArray();
            for(int j=0; j<temp.length; j++){
                if(temp[j] == 'B') chess[i][j] = 0;
                else chess[i][j] = 1;
            }
        }

        for(int row=0; row<=n-8; row++){
            for(int col=0; col<=m-8; col++){
                check(row, col);
            }
        }

        System.out.println(min);
    }

    public static void check(int x, int y){
        int color = chess[x][y];
        int count = 0;

        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if(chess[i][j] != color){
                    count++;
                }

                color = color == 0 ? 1 : 0;
            }
            color = color == 0 ? 1 : 0;
        }

        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}
