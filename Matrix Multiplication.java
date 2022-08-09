public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int arows=A.length;
        int acolum=A[0].length;
        int brows=B.length;
        int bcolum=B[0].length;
        int[][] c= new int[arows][bcolum];
        for(int i=0;i<arows;i++)
        {
            for(int j=0;j<bcolum;j++)
            {
                c[i][j]=0;
                for(int k=0;k<brows;k++)
                {
c[i][j]=c[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        return c;
    }
}
