import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            int score = 0;
            int sum = 0;
            String s = br.readLine();
            
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == 'O'){
                    score++;
                    sum += score;
                }else if(s.charAt(j) == 'X'){
                    score = 0;
                }
            }
            
            System.out.println(sum);
        }
    }
}
