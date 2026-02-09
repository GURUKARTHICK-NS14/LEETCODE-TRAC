// Last updated: 2/9/2026, 11:55:24 AM
class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
                }
        }
        return -1;
    }
}