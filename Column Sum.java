You are given a 2D integer matrix A, return a 1D integer vector containing column-wise sums of original matrix.
public class Solution {
    public int[] solve(int[][] A) {

int row =A.length;
int colum=A[0].length;
        int[] ans =new int[colum];
        for(int j=0;j<colum;j++)
        {
            int sum=0;
            for(int i=0;i<row;i++)
            {
                sum=sum+A[i][j];
            }
            ans[j]=sum;
        }
        return ans;
    }
}
