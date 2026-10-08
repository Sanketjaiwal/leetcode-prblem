class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
            int j=0;
            int k=i;
            int privous=matrix[j][k];
            while(j<matrix.length&&k<matrix[0].length){
                if(matrix[j][k]!=privous){
                    return false;
                }
                j++;k++;
            }
        }
         for(int i=0;i<matrix.length;i++){
            int j=0;
            int k=i;
            int privous=matrix[k][j];
            while(j<matrix[0].length&&k<matrix.length){
                if(matrix[k][j]!=privous){
                    return false;
                }
                j++;
                k++;
            }
        }
        return true;
    }
}