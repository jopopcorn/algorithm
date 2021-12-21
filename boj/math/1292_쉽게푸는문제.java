import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] arr = new int[1001];
        int count = 0;
        int number = 1;

        for(int i=0; i<1000; i++){
            count++;
            arr[i] = number;

            if(number != count) continue;
            count = 0;
            number++;
        }

        int sum = 0;
        for(int i=start-1; i<end; i++){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
