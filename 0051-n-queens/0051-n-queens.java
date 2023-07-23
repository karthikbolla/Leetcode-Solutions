class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        int[] uppdiag=new int[2*n-1];
        int[] lowdiag=new int[2*n-1];
        int[] leftrow=new int[n];
        solve(0, n, ans, board,uppdiag,lowdiag,leftrow);
        return ans;
    }

    private void solve(int col, int n, List<List<String>> ans, char[][] board, int[] uppdiag, int[] lowdiag, int[] leftrow) {
        if(col==n){
            ans.add(constructboard(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(uppdiag[col+row]==0 && lowdiag[(n-1)+(col-row)]==0 && leftrow[row]==0){
                board[col][row]='Q';
                uppdiag[col+row]=1;
                lowdiag[(n-1)+(col-row)]=1;
                leftrow[row]=1;
                solve(col+1,n,ans,board,uppdiag,lowdiag,leftrow);
                board[col][row]='.';
                uppdiag[col+row]=0;
                lowdiag[(n-1)+(col-row)]=0;
                leftrow[row]=0;
            }
        }
    }


    private List<String> constructboard(char[][] board) {
        List<String> sol = new ArrayList<>();
        for (char[] row : board) {
            sol.add(new String(row));
        }
        return sol;
    }
}