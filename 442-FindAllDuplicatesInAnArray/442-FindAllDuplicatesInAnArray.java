// Last updated: 2/9/2026, 11:55:21 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ll=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int inval=Math.abs(nums[i])-1;
            if(nums[inval]<0){
                ll.add(Math.abs(nums[i]));
            }else{
                nums[inval]=nums[inval]*-1;
            }
        }
        return ll;
    }
}