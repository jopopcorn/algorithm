class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i=3; i<sum; i++){
            int width = sum / i;
            int height = sum / width;
            
            if(width < height) continue;
            
            if((width-2)*(height-2) == yellow){
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        
        return answer;
    }
}
