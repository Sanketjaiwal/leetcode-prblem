class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        
        int[][] originalrix= new int[m][n];
        int k=0,l=0;
        if(original.length!=m*n){
            return new int[][]{ };
        }
        for(int i=0;i<original.length;i++){
                    if(l==n&&k<m){
                        l=0;
                        k++;
                    }
                    originalrix[k][l]=original[i];
                    l++;
        }
        return originalrix;
        
    }
}