class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        
        if(len==1 && flowerbed[0]==0 && n==1) return true;
        else if(n==0) return true;
        
        if(len>1){
            
             for(int i=0; i<flowerbed.length; i++){
            if(i==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }
            else if(i==len-1 && flowerbed[i]==0 && flowerbed[i-1]==0){
                 flowerbed[i]=1;
                    n--;
            }
            else if(i>0 && i<len-1 && flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0 ){
                flowerbed[i]=1;
                n--;
            }
            
            }
            
             if(n>0) return false;
            else return true;
            
        }
        // for(int a: flowerbed) System.out.print(a+" ");
       else return false;
        
        
        
       
        
    }
}