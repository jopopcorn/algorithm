import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class StringRearrange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<Character> alphabet = new ArrayList<>();
        int sum = 0;

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
                alphabet.add(input.charAt(i));
            }else{
                sum += input.charAt(i) - '0';
            }
        }

        Collections.sort(alphabet);

        StringBuilder sb = new StringBuilder();
        for(Character c: alphabet){
            sb.append(c);
        }

        if(sum != 0) sb.append(sum);

        System.out.println(sb);
        br.close();
    }
}

