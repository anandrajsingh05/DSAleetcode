class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n= matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;
        int count=0;
        List<Integer> list= new ArrayList<>();
        while(count<n*m){
            for(int i= left; i<=right && count<n*m; i++){
                list.add(matrix[top][i]);
                count++;
            }
            top++;
            
            for(int i= top; i<=bottom && count<n*m; i++){
                list.add(matrix[i][right]);
                count++;
            }
            right--;
            
            for(int i= right; i>=left && count<n*m; i--){
                list.add(matrix[bottom][i]);
                count++;
            }
            bottom--;
            
            for(int i= bottom; i>=top && count<n*m; i--){
                list.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        
        return list;
    }
}