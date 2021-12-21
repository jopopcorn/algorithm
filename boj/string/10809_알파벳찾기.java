import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        int[] alphabets = new int[26];
        
        Arrays.fill(alphabets, -1);
        
        for(int i=0; i<s.length(); i++){
            int order = s.charAt(i) - 'a';
            if(alphabets[order] == -1){
                alphabets[order] = i;
            }
        }
        
        for(int i=0; i<alphabets.length; i++){
            System.out.print(alphabets[i] + " ");
        }
    }
}
