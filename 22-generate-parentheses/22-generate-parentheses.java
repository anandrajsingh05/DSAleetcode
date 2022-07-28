class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res= new ArrayList<>();
        solve(res,n,0,0,"");
        return res;
    }
    
    public void solve(List<String> strArr, int n, int open, int close, String str){
        
        if(str.length()==n*2){
            strArr.add(str);
            return;
        }
        
        if(open<n){
            solve(strArr, n, open+1, close, str+"(" );
        }
        if(close<open){
            solve(strArr, n, open, close+1, str+")" );
        }
        
        
    }
}