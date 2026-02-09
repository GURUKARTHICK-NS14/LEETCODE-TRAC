// Last updated: 2/9/2026, 11:55:32 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length())return false;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)<0)return false;
        }
        return true;
    }
}