class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        
        int turn = 0;
        while(count > turn){
            turn++;
            answer -= price * turn;
        }
        
        if(answer > 0) return 0;
        
        return Math.abs(answer);
    }
}
