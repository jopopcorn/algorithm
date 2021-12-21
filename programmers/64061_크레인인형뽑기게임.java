import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayList<Integer> basket = new ArrayList<>();
        int answer = 0;
        
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1] == 0) continue;
                
                basket.add(board[j][moves[i]-1]);
                board[j][moves[i]-1] = 0;
                break;
            }
        }
        
        for(int i=0; i<basket.size()-1; i++){
            if(basket.get(i) == basket.get(i+1)){
                basket.remove(i);
                basket.remove(i);
                answer += 2;
                i = -1;
            }
        }
        
        return answer;
    }
}
