import java.util.*;
import java.io.*;

public class Main{
    public static int[] operators = new int[4];
    public static int[] numbers;
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            operators[i] = Integer.parseInt(st.nextToken());
        }
        
        permutation(numbers[0], 1);
        
        System.out.println(max);
        System.out.println(min);
        br.close();
    }
    
    public static void permutation(int num, int index){
        if(index == n){
            max = Math.max(num, max);
            min = Math.min(num, min);
            return;
        }
        
        for(int i=0; i<4; i++){
            if(operators[i] <= 0) continue;
            operators[i]--;
            switch(i){
                case 0: permutation(num + numbers[index], index+1); break;
                case 1: permutation(num - numbers[index], index+1); break;
                case 2: permutation(num * numbers[index], index+1); break;
                case 3: permutation(num / numbers[index], index+1); break;
            }
            operators[i]++;
        }
    }
}
