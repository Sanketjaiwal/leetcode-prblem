class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Skip empty cells
                if (board[i][j] == '.') continue;
                
                // 1. Corrected Row Check (Iterate through columns 'k' in row 'i')
                for (int k = 0; k < 9; k++) {
                    if (j == k) continue; // Skip the current cell itself
                    if (board[i][k] == board[i][j]) return false;
                }
                
                // 2. Corrected Column Check (Iterate through rows 'k' in column 'j')
                for (int k = 0; k < 9; k++) {
                    if (i == k) continue; // Skip the current cell itself
                    if (board[k][j] == board[i][j]) return false;
                }
                
                // 3. Added 3x3 Sub-grid Check
                int boxRowStart = (i / 3) * 3;
                int boxColStart = (j / 3) * 3;
                for (int r = boxRowStart; r < boxRowStart + 3; r++) {
                    for (int c = boxColStart; c < boxColStart + 3; c++) {
                        if (r == i && c == j) continue; // Skip the current cell itself
                        if (board[r][c] == board[i][j]) return false;
                    }
                }
            }
        }
        return true;
    }
}
