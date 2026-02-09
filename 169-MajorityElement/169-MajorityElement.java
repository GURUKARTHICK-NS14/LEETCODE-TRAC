// Last updated: 2/9/2026, 11:55:38 AM
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>nums.length/2){
                return i;
            }
        }
        return -1;
    }
}