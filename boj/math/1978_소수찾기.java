import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        boolean[] notPrime = new boolean[arr[n - 1] + 1];

        notPrime[0] = true;
        notPrime[1] = true;

        int answer = 0;

        for(int i=2; i<Math.sqrt(notPrime.length); i++){
            if(notPrime[i]){
                continue;
            }

            for(int j=i*2; j<notPrime.length; j+=i){
                notPrime[j] = true;
            }
        }

        for(int i=0; i<n; i++){
            if(notPrime[arr[i]]) continue;
            answer++;
        }

        System.out.println(answer);
    }
}
