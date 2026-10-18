class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        if(boxGrid==null||boxGrid.length==0||boxGrid[0].length==0) return boxGrid;
        int m=boxGrid.length;
        int n=boxGrid[0].length;
        char[][] rotate=new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotate[j][m -1 - i] = boxGrid[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            int k=n-1;
           for(int j=n-1;j>=0;j--){
                if(rotate[j][i]=='#'){
                    char temp=rotate[j][i];
                    rotate[j][i]=rotate[k][i];
                    rotate[k][i]=temp;
                    k--;
                }
                else if(rotate[j][i]=='*'){
                    k=j-1;
                }
           }
        }
        return rotate;
    }
}