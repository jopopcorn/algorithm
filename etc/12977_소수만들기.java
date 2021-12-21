class Solution {
    public static int answer = 0;
    public int solution(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        combi(nums, visited, 0, 3, 0);
        return answer;
    }
    
    public void combi(int[] nums, boolean[] visited, int start, int r, int sum){
        if(r == 0){
            if(sum == 2) {
                answer += 1;
            }else{
                boolean isPrime = true;
                for(int i=2; i<sum; i++){
                    if(sum % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if(isPrime) answer += 1;
            }
            return;
        }else{
            for(int i=start; i<nums.length; i++){
                if(visited[i]) continue;
                visited[i] = true;
                combi(nums, visited, i+1, r-1, sum+nums[i]);
                visited[i] = false;
            }
        }
    }
}
