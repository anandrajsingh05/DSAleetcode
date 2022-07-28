class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3) return 0;
        
        int res=0;
        int start=0;
        while(start<arr.length){
            int end=start;
            if(end+1<arr.length && arr[end]<arr[end+1]){
                while(end+1<arr.length && arr[end]<arr[end+1]){
                    end++;
                }
                if(end+1<arr.length && arr[end]>arr[end+1]){
                    while(end+1<arr.length && arr[end]>arr[end+1]){
                        end++;
                    }
                    
                   res=Math.max(res,end-start+1);
                }
                  
            }
            start=Math.max(end,start+1);
        }
        
        return res;   
       
    }
}