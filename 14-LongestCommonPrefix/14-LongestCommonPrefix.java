// Last updated: 2/9/2026, 11:56:06 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int n = strs.length;
        if (n == 0 || strs[0].length() == 0) {
            return s;
        }
        int t = 0;  
        while (true) {
            if (t >= strs[0].length()) {
                return s; 
            }
            char currentChar = strs[0].charAt(t); 
            for (int i = 1; i < n; i++) {
                if (t >= strs[i].length() || strs[i].charAt(t) != currentChar) {
                    return s; 
                }
            }
            s += currentChar;
            t++;
        }
    }
}
