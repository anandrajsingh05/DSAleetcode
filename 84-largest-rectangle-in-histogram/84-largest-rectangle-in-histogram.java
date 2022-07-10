class Solution {
    
    public int[] leftmin(int[] arr){
        Stack<Integer> stack= new Stack<>();
        int[] res= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            while(!stack.empty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.empty()) res[i]= -1;
            else res[i]=stack.peek();
            stack.push(i);
        }
        return res;
    }
    
    public int[] rightmin(int[] arr){
        Stack<Integer> stack= new Stack<>();
        int[] res= new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            while(!stack.empty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.empty()) res[i]= arr.length;
            else res[i]=stack.peek();
            stack.push(i);
        }
        return res;
    }
    
    
    public int largestRectangleArea(int[] heights) {
        int[] left=leftmin(heights);
        int[] right= rightmin(heights);
        int maxarea=0;
        for(int i=0; i<heights.length; i++){
            int gapdiff= (right[i]-left[i])-1;
            int area= gapdiff*heights[i];
            if(area>maxarea){
                maxarea=area;
            }
        }
        return maxarea;
    }
}