// Last updated: 2/9/2026, 11:55:31 AM
class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        if(sum>9){
            return addDigits(sum);
        }else{
            return sum;
    }
    }
}