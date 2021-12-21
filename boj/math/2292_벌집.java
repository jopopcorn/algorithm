import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int now = 1;
        int answer = 1;
        
        if(n == 1){
            System.out.println(1);
        }else{
            while(n > now){
                now += 6 * answer;
                answer++;
            }
            
            System.out.println(answer);
        }
    }
}
