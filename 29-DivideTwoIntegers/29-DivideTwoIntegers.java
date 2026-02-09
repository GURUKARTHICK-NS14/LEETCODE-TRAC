// Last updated: 2/9/2026, 11:56:02 AM
class Solution {
    public int divide(int dividend, int divisor) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int ans=0;
        if(dividend==min && divisor==-1){
            return max;
        }else{
            ans=dividend/divisor;
        }
        return ans;
    }
}