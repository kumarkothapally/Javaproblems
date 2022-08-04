You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

public class Solution {
    public long subarraySum(int[] A) {
        long totalsum=0;
        int l=A.length;
        for(int i=0;i<A.length;i++)
        {  
            int sum=0;
            int left=i+1;
            int right=l-i;
            int rotations=left*right;
            sum= rotations*A[i];
            totalsum=totalsum+sum;

        }
        return totalsum;
    }
}
