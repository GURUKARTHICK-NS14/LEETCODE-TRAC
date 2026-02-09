// Last updated: 2/9/2026, 11:56:13 AM
class Solution {
    public boolean isPali(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                    return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String longpali="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String str=s.substring(i,j);
                if(isPali(str)){
                    if(longpali.length()<str.length()){
                        longpali=str;
                    }
                }
            }
        }
        return longpali;
    }
}