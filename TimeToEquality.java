/*
	 * Given an integer array A of size N. In one second, you can increase the value
	 * of one element by 1.
	 * 
	 * Find the minimum time in seconds to make all elements of the array equal.
	 */

public class Solution {
    public int solve(int[] A) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(max<A[i])
            {
                max=A[i];
            }
        }

        for(int i=0;i<A.length;i++)
        {
              count =count+max-A[i];
        }

        return count;
    }
}
