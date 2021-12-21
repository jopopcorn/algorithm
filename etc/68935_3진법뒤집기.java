class Solution {
    public int solution(int n) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            sb.append(n % 3);
            n /= 3;
        }
        
        // 10진법을 n진법으로 변환할 때 parseInt로 n진법 변환 가능
        answer = Integer.parseInt(sb.toString(), 3);
        
        
        return answer;
    }
}
