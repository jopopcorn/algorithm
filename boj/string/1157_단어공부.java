import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        String input = br.readLine().toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            int n = input.charAt(i) - 'A';
            alphabet[n] += 1;
        }

        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < alphabet.length; i++) {
            if(max < alphabet[i]){
                max = alphabet[i];
                maxIndex = i;
            }else if(max == alphabet[i]){
                maxIndex = -1;
            }
        }

        if(maxIndex == -1){
            System.out.println("?");
        }else{
            System.out.println((char)('A'+maxIndex));
        }
    }
}

