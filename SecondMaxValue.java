public class Solution {
    public int solve(int[] A) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        if(A.length==1)
        {
            return -1;
        }
        for(int i=0;i<A.length;i++)
        {
            if(max<A[i])
            {
                max=A[i];
            }
            else if(secmax<A[i])
            {
secmax=A[i];
            }
        }
       return secmax;
    }
}
