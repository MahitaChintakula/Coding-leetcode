class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
            }
        }
        if(sum%2!=0) return false;
        long tar=sum/2;
        long h=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                h+=grid[i][j];
            }
            if(h==tar) return true;
        }
        long v=0;
        for(int j=0;j<n-1;j++){
            for(int i=0;i<m;i++){
                v+=grid[i][j];
            }
            if(v==tar) return true;
        }
        return false;
    }
}