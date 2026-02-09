// Last updated: 2/9/2026, 11:55:54 AM
class Solution {
    public boolean isThere(int[] m,int k){
        int low=0,high=m.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(m[mid]==k) return true;
            if(m[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            if(isThere(matrix[i],target)){
                return true;
            }
        }
        return false;
    }
}