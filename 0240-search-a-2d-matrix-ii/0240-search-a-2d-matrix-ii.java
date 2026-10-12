class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int n = matrix.length;     
        int m = matrix[0].length;  
        // int targetRow = -1;

        // for (int i = 0; i < n; i++) {
        //     if (target >= matrix[i][0] && target <= matrix[i][m - 1]) {
        //         targetRow = i;
        //         break;
        //     }
        // }
        // if (targetRow == -1) {
        //     return false;
        // }

        // for (int j = 0; j < m; j++) {
        //     if (matrix[targetRow][j] == target) {
        //         return true;
        //     }
        // }
        int i=0,j=m-1;
        while(i<n&&j>=0){
            if(target==matrix[i][j])
            return true;
            else if(target<matrix[i][j])
            j--;
            else
            i++;
        }
        return false;
    }
}