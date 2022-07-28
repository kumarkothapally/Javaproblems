public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {
        int j =  A.length-1;
        int i=0;
        while(i<j)
        {
            A[i]=A[i]+A[j];
            A[j]= A[i]-A[j];
            A[i]=A[i]-A[j];
            i++;
            j--;
        }

        return A;
    }
}
