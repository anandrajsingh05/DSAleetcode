class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int a : nums){
            pq.add(a);
        }
        
        while(pq.size()>k){
            pq.remove();
        }
        
        return pq.remove();
        
    }
}