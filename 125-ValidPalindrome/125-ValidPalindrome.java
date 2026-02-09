// Last updated: 2/9/2026, 11:55:44 AM
class Solution {
    public boolean isPalindrome(String s) {
        String rev="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c<=90&&c>=65)||(c<=122&&c>=97)||(c<=57&&c>=48)){
                if(c<=90&&c>=65){
                    rev+=(char)(c+32);
                }else{
                rev+=c;
            }
            }
        }
        int i=0,j=rev.length()-1;
        while(i<j){
            if(rev.charAt(i)!=rev.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}