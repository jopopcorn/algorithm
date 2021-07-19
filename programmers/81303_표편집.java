import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> stack = new Stack<>();
        int resultSize = n;
        for (String s : cmd) {
            char command = s.charAt(0);

            if (command == 'U') {
                k -= Integer.valueOf(s.substring(2));
            } else if (command == 'D') {
                k += Integer.valueOf(s.substring(2));
            } else if (command == 'C') {
                stack.push(k);
                resultSize -= 1;

                if (k == resultSize) k -= 1;
            } else {
                // Z
                if(k >= stack.pop()) k += 1;
                resultSize += 1;
            }
        }

        StringBuilder answer = new StringBuilder("O".repeat(resultSize));

        while(!stack.isEmpty()){
            answer.insert(stack.pop(), "X");
        }

        return answer.toString();
    }
}
