import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(checkArithmeticSequence(n));
        br.close();
    }
    
    public static int checkArithmeticSequence(int n){
        if(n < 100){
            return n;
        }
        
        int count = 99;
            
        if(n == 1000){
            // 1000은 한수가 아니므로 세자리 수까지만 체크하도록 함
            n = 999;
        }
            
        for(int i=100; i<=n; i++){
            int first = i / 100;
            int second = (i % 100) / 10;
            int third = (i % 10) % 10;
                
            if(third - second == second - first){
                count++;
            }
        }
        
        return count;
    }
}
