class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] phone = {{1,2,3}, {4,5,6}, {7,8,9}, {10, 11, 12}};
        int pL = 10, pR = 12;
        
        for(int num: numbers){
            if(num == 0) num = 11;
            switch(num % 3) {
                case 0: {
                    pR = num;
                    answer.append("R");
                }
                break;
                case 1: {
                    pL = num;
                    answer.append("L");
                }
                break;
                case 2: {
                    int distanceL = Math.abs(pL - num)/3 + Math.abs(pL - num)%3;
                    int distanceR = Math.abs(pR - num)/3 + Math.abs(pR - num)%3;
                
                    if(distanceL > distanceR){
                        pR = num;
                        answer.append("R");
                    }else if(distanceL < distanceR){
                        pL = num;
                        answer.append("L");
                    }else{
                        if(hand.equals("left")){
                            pL = num;
                            answer.append("L");
                        }else{
                            pR = num;
                            answer.append("R");
                        }
                    }
                }
                break;
            }
        }
        
        return answer.toString();
    }
}
