class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int n : nums){
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }
        
        for(int n : nums){
            if(hashMap.get(n) == 1) return n;
        }
        
        return 0;
    }
}
