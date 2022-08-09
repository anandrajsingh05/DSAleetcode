class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map= new LinkedHashMap<>();
        int index= -1;
        for(int i=0; i<s.length(); i++){
            Integer count=map.get(s.charAt(i));
            map.put(s.charAt(i), count!=null ? count+1 : 1);
        }
        
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1) return i;
        }
        
        
        return -1;
    }
}