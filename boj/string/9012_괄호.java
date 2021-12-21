import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if(checkVPS(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static boolean checkVPS(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char parenthesis = s.charAt(i);
            if(parenthesis == '('){
                stack.push(parenthesis);
            }else{
                if(stack.empty()){
                    return false;
                }

                if(stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
