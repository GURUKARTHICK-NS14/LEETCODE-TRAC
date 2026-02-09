// Last updated: 2/9/2026, 11:55:16 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int presum[]=new int[n];
        int sufsum[]=new int[n];
        presum[0]=nums[0];
        for(int i=1;i<n;i++){
            presum[i]=nums[i]+presum[i-1];
        }
        sufsum[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sufsum[i]=nums[i]+sufsum[i+1];
        }
        for(int i=0;i<n;i++){
            if(presum[i]==sufsum[i]){
                return i;
            }
        }
        return -1;
    }
}