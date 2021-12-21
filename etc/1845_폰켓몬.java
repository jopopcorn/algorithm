import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int select = nums.length / 2;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        if(set.size() < select){
            return set.size();
        }
        
        return select;
    }
}
