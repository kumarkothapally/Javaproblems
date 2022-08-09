public class Solution {
    public int[][] generateMatrix(int A) {
        int n = A;
        int[][] c=new int[A][A];
        int i=0,j=0,count=1;

        if(A==1)
        {
            c[i][j]=1;
            return c;
        }
        

        while(n>0){
            if(n==1)
            {
                c[i][j]=count;
            }
       
for(int k=1;k<=n-1;k++)
{
    c[i][j]=count;
    ++count;
    ++j;
}
for(int k=1;k<=n-1;k++)
{
    c[i][j]=count;
    count++;
    i++;
}
for(int k=1;k<=n-1;k++)
{
    c[i][j]=count;
    count++;
    j--;
}
for(int k=1;k<=n-1;k++)
{
    c[i][j]=count;
    count++;
    i--;
}
            n=n-2;
            i++;
            j++;
        }
        return c;
    }
}
