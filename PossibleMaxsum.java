
	/*
	 * You are given an integer array A of size N.
	 * 
	 * You have to pick B elements in total. Some (possibly 0) elements from left
	 * end of array A and some (possibly 0) from the right end of array A to get the
	 * maximum sum.
	 * 
	 * Find and return this maximum possible sum.
	 * 
	 * NOTE: Suppose B = 4, and array A contains 10 elements, then
	 */
public class Solution {
    public int solve(int[] A, int B) {
        int currentSum=0;
        int N=A.length;
        int j=N;
       
        for(int i=0;i<B;i++)
        {
 currentSum =  currentSum+A[i];
        }
int max=currentSum;
 int i=B;
        while(j>N-B && i>0)
        {
            currentSum=currentSum+A[--j]-A[--i];
            max=maxsum(max,currentSum);
        }
return max;        
    }
    public int maxsum(int maxsum,int currentsum)
        {
            if(maxsum>currentsum)
            return maxsum;
            else
            return currentsum;
        }
}

