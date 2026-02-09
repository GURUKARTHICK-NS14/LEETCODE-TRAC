// Last updated: 2/9/2026, 11:55:18 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int org=num;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(org==sum){
            return true;
        }else{
            return false;
        }
    }
}