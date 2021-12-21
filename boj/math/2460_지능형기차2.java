import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0;
        
        int sum = 0;
        
        for(int i=0; i<10; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int outPeople = Integer.parseInt(st.nextToken());
            int inPeople = Integer.parseInt(st.nextToken());
            
            sum += inPeople - outPeople;
            
            if(max < sum){
                max = sum;
            }
        }
        
        System.out.println(max);
    }
}
