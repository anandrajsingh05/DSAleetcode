class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map= new HashMap<>();
        
        
        for(int a=0; a<nums.length; a++){
            int comp= target-nums[a];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),a};
            }
            map.put(nums[a],a);
        }
        
        
         return new int []{-1,-1};
        
    }
}