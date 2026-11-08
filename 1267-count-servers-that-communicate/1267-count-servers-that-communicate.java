class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[] readrow=new int[n];
        int[] readcol=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    readrow[i]++;
                    readcol[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&(readrow[i]>1||readcol[j]>1)){
                    count++;
                }
            }
        }
        return count;
    }
}