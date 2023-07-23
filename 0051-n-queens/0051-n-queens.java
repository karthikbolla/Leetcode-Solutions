class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solve(0, n, ans, board);
        return ans;
    }

    private void solve(int col, int n, List<List<String>> ans, char[][] board) {
        if (col == n) {
            ans.add(constructboard(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (issafe(col, row, board, n)) {
                board[col][row] = 'Q';
                solve(col + 1, n, ans, board);
                board[col][row] = '.';
            }
        }
    }

    private boolean issafe(int col, int row, char[][] board, int n) {
        int dupcol = col;
        int duprow = row;
        while (col >= 0 && row >= 0) {
            if (board[col][row] == 'Q')
                return false;
            col--;
            row--;
        }
        col = dupcol;
        row = duprow;
        while (col >= 0) {
            if (board[col][row] == 'Q')
                return false;
            col--;
        }
        col = dupcol;
        row = duprow;
        while (col >= 0 && row < n) {
            if (board[col][row] == 'Q')
                return false;
            col--;
            row++;
        }
        return true;
    }

    private  List<String> constructboard(char[][] board) {
        List<String> sol = new ArrayList<>();
        for (char[] row : board) {
            sol.add(new String(row));
        }
        return sol;
    }
}