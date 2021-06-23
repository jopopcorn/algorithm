import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyStraight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int result = 0;
        for(int i=0; i<input.length()/2; i++){
            result += input.charAt(i) - '0';
        }

        for(int i=input.length()/2; i<input.length(); i++){
            result -= input.charAt(i) - '0';
        }

        if(result == 0){
            System.out.println("LUCKY");
        }else{
            System.out.println("READY");
        }
        br.close();
    }
}

