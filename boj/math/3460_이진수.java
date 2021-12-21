import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
            String result = sb.reverse().toString();
            for(int j=0; j<result.length(); j++){
                if(result.charAt(j) == '1'){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

    }
}
