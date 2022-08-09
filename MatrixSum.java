You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
  
  public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
    int row=A.length;
        int colum=A[0].length;
        int[][] ans=new int[row][colum];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<colum;j++)
            {
                ans[i][j]=A[i][j]+B[i][j];
            }
        }
        return ans;
    }
}
