
You are given a matrix A, you have to return another matrix which is the transpose of A.

NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row


public class Solution {
    public int[][] solve(int[][] A) {
        int rows=A.length;
        int column=A[0].length;
        int[][] T_matrix = new int[column][rows];
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<rows;j++)
            {
                if(i!=j && i<j&& rows==column)
                {
                    A[i][j]=A[i][j]+A[j][i];
                    A[j][i]=A[i][j]-A[j][i];
                    A[i][j]=A[i][j]-A[j][i];

                }
                else
                {
                     T_matrix[i][j] = A[j][i];
                }
            }
        }
        if(rows==column)
         return A;
         else
         return T_matrix;
    }
   
}
