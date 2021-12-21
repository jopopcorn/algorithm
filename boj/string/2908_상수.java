import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        
        String result = "";
        
        for(int i=2; i>=0; i--){
            int n1 = s1.charAt(i) - '0';
            int n2 = s2.charAt(i) - '0';
            if(n1 == n2) continue;
            result = n1 > n2 ? s1 : s2; break;
        }
        
        for(int i=result.length()-1; i>=0; i--){
            System.out.print(result.charAt(i));
        }
        
        System.out.println();
    }
}
