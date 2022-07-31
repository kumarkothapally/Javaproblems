public class Solution {
    public int solve(int[] A) {
        int[] ps = new int[A.length];
        int minIndex=Integer.MAX_VALUE;
        int len=A.length;
        int leftsum=0;
        int rightsum=0;
     ps[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
    ps[i] = ps[i-1]+A[i];
        }

        for(int k=0;k<len;k++)
        {
            if(k==0)
            leftsum=0;
            else
            leftsum= ps[k-1];
            rightsum=ps[len-1]-ps[k];
            if(leftsum==rightsum)
            {
                if(minIndex>k)
                {
                    minIndex=k;
                }
            }
            
        }
        if(minIndex!=Integer.MAX_VALUE)
        return minIndex;
        else
        return -1;
    }
}
