You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.
  
Problem Constraints
1 <= A.size() <= 103

1 <= A[i].size() <= 103

0 <= A[i][j] <= 103
Input Format
First argument is a vector of vector of integers.(2D matrix).
Output Format
Return a vector of vector after doing required operations.
Example Input
Input 1:
[1,2,3,4]
[5,6,7,0]
[9,2,0,4]
Example Output
Output 1:
[1,2,0,0]
[0,0,0,0]
[0,0,0,0]


public class Solution {
    public int[][] solve(int[][] A) {
        int m=A.length;
        int n=A[0].length;
        int[] rows=new int[m];
        int[] columns=new int[n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(A[i][j]==0)
                {
                    rows[i]=1;
                    columns[j]=1;
                }
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(rows[i]==1||columns[j]==1)
                {
                    A[i][j]=0;
                }
            }
        }
        return A;
    }
}
