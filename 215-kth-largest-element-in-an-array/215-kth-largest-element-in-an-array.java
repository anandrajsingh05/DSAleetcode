class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int a : nums){
            pq.add(a);
             if(pq.size()>k){
                pq.poll();
            }
        }
        
       
        
        return pq.peek();
        
    }
}