import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int[] answer = new int[n];
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<n; i++){
            int ranking = 1;
            for(int j=0; j<n; j++){
                if(i == j) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    ranking++;
                }
            }
            answer[i] = ranking;
        }
        
        for(int i=0; i<n; i++){
            System.out.print(answer[i] + " ");
        }
    }
}
