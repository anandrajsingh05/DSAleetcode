class Solution {
    public int reverse(int x) {
        
        int sign= 1;
        
        
        if(x<0){
            sign= -1;
             x=x*sign;
            
        }
        
        int res=0;
        while(x>0){
            if(res*sign >Integer.MAX_VALUE/10 || res*sign <Integer.MIN_VALUE/10) return 0;
            int rem= x%10;
            res=res*10+rem;
            x=x/10;
            
        }
        
        
        
        return res*sign;
        
    }
}