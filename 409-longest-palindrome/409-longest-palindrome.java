class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else map.put(s.charAt(i),1);
        }
        
        System.out.println(map);
        int sum=0;
        int count=0;
        for(int a : map.values()){
            if(a%2==0){
                 sum+=a;
            }
            else{
                if(a!=1){
                    sum+=(a-1);
                }
            } 
        }
        if(map.size()==1)return map.get(s.charAt(0));
        else if(sum==s.length())return sum;
        return sum+1;
        
    }
}