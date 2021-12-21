class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int length = s.length();
        int[] answer = new int[length];
        
        for(int i=0; i<length; i++){
            answer[i] = s.charAt(length-1-i) - '0';
        }
        
        return answer;
    }
}
