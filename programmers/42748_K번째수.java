import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<answer.length; i++){
            int[] temp = splitArray(array, commands[i][0]-1, commands[i][1]-1);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
    
    public int[] splitArray(int[] arr, int start, int end){
        int[] temp = new int[end - start + 1];
        int n = 0;
        for(int i=start; i<=end; i++){
            temp[n] = arr[i];
            n++;
        }
        
        Arrays.sort(temp);
        return temp;
    }
}
