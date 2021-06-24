import java.util.*;

class Solution {
   public int solution(String s) {
        if(s.length() == 1) return s.length();

        int result = s.length();
        for(int i=1; i<=s.length()/2; i++){
            int compressedLength = compress(s, i);
            result = Math.min(result, compressedLength);
        }
        return result;
    }

    public int compress(String s, int i){
        StringBuilder sb = new StringBuilder();
        String prev = s.substring(0, i);
        int count = 1;

        String next;
        for(int k=i; k<s.length(); k+=i){
            if(k+i >= s.length()){
                next = s.substring(k);
            }else{
                next = s.substring(k, k+i);
            }

            if(prev.equals(next)){
                count++;
            }else{
                if(count == 1){
                    sb.append(prev);
                }else{
                    sb.append(count).append(prev);
                }
                count = 1;
                prev = next;
            }
        }

        if(count == 1){
            sb.append(prev);
        }else{
            sb.append(count).append(prev);
        }

        return sb.length();
    }
}
