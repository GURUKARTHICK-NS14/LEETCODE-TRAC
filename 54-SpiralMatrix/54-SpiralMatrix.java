// Last updated: 2/9/2026, 11:55:59 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ll=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;
        int total=row*col;
        int cnt=0;
        while(cnt<total){
        for(int j=left;j<=right && cnt<total;j++){
            ll.add(matrix[top][j]);
            cnt++;
        }
        top++;
        for(int i=top;i<=bottom && cnt<total;i++){
            ll.add(matrix[i][right]);
            cnt++;
        }
        right-- ;
        for(int j=right;j>=left && cnt<total;j--){
            ll.add(matrix[bottom][j]);
            cnt++;
        }
        bottom-- ;
        for(int j=bottom;j>=top && cnt<total;j--){
            ll.add(matrix[j][left]);
            cnt++;
        }
        left++ ;
    }
    return ll;
    }
}