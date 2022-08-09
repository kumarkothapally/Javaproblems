You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M)). You have to subtract matrix A from B and return the resultant matrix. (i.e. return the matrix A - B).

If X and Y are two matrices of the same order (same dimensions). Then X - Y is a matrix of the same order as X and Y and its elements are obtained by subtracting the elements of Y from the corresponding elements of X. Thus if Z = [z[i][j]] = X - Y, then [z[i][j]] = [x[i][j]] – [y[i][j]].
  
  public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int row=A.length;
        int colum=A[0].length;
        int[][] ans=new int[row][colum];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<colum;j++)
            {
                ans[i][j]=A[i][j]-B[i][j];
            }
        }
        return ans;
    }
}
