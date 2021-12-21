import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;
        int T = Integer.parseInt(br.readLine());

        for(int k=0; k<T; k++){
            arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<10; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            System.out.println(arr[10 - 3]);
        }

    }
}
