import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        int[] answer = new int[arr.length-1];
        
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(min == arr[i]){
                continue;
            }
            answer[j++] = arr[i];
        }
        
        return answer;
    }
}
