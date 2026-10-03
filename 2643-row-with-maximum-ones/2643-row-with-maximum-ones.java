class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result={0,0};
        // int i=0;
        // int j=mat[0].length-1;
        // while(i<mat.length&& j>=0){
        //     if(mat[i][j]==1){
        //         j--;
        //         result[0]=i;
        //         result[1]=mat[0].length-j;
        //     }else{
        //         i++;
                
        //     }
        // }
         
        
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