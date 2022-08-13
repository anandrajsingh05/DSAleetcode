class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n= num.length;
        List<Integer> list= new ArrayList<>();
        int i=n-1;
        int sum= k;
       
        while(i>=0 || sum>0){
            
            if(i>=0) {
                sum+= num[i];
            }
             list.add(sum%10);
             sum/=10;
             i--;
            
        }
        
        Collections.reverse(list);
        return list;
    }
}