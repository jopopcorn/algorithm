import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static int n, m;
    public static int[] card;
    public static boolean[] visited;
    public static int result = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        card = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            if(st.hasMoreTokens()){
                card[i] = Integer.parseInt(st.nextToken());
            }
        }

        //전체 카드 중 3장을 순서없이 뽑으므로 조합을 사용
        for(int i=0; i<n; i++){
            combination(card, visited, i, 3);
            if(result == m) break; // m과 값이 같으면 더이상 계산하지 않아도 됨
        }

        System.out.println(result);
        br.close();
    }

    public static void combination(int[] arr, boolean[] visited, int start, int r){
        if(r == 0){
            int sum = calculate();
            if(sum <= m && m - sum < m - result){
                result = sum;
            }
            return;
        }

        for(int i=start; i<arr.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            combination(arr, visited, i+1, r-1);
            visited[i] = false;
        }

    }

    public static int calculate(){
        int sum = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]) continue;
            sum += card[i];
        }
        return sum;
    }
}
