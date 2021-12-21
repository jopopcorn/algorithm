class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int sameCount = 0;
        
        for(int lotto: lottos){
            if(lotto == 0) zeroCount++;
            else{
                for(int win: win_nums){
                    if(lotto == win){
                        sameCount++;
                        break;
                   }
                }
            }
        }
        
        int max = sameCount + zeroCount;
        
        int[] answer = {Math.min(7-max, 6), Math.min(7-sameCount, 6)};
        
        return answer;
    }
}
