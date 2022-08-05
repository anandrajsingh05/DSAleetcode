class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Integer count=map.get(s.charAt(i));
            map.put(s.charAt(i), count !=null ? count+1 : 1);
        }
        
         for(int i=0; i<t.length(); i++){
            Integer count=map.get(t.charAt(i));
            if(count!=null){
                map.put(t.charAt(i),count-1);
            }
        }
        
        for(int a : map.values()){
            if(a!=0) return false;
        }
        
        return true;
        
    }
}