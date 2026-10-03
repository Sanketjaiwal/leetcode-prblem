class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result={0,0};       
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                count+=mat[i][j];
            }
            if(result[1]<count){
                result[0]=i;
                result[1]=count;
            }
        }
        return result;
    }
}