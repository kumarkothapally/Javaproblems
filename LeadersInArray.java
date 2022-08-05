Given an integer array A containing N distinct integers, you have to find all the leaders in array A.

An element is a leader if it is strictly greater than all the elements to its right side.
public class Solution {
    public int[] solve(int[] A) {
        int n=A.length;
        List<Integer> li= new ArrayList<Integer>();
        int k=0;
        int curlead=A[n-1];
        int[] out =new int[n];
        out[k]=curlead;
        li.add(curlead);
        int count=1;
        for(int i=n-2;i>=0;i--)
        {
            if(A[i]>curlead)
            {
                curlead=A[i];
                count++;
                 k++;
                out[k]=curlead;
                li.add(A[i]);
               
            }
        }
        int[] ans= new int[count];
        int r=0;
        for(int i=0;i<out.length;i++)
        {
            if(out[i]!=0)
            {
                ans[r]=out[i];
                r++;
            }
        }
        return ans;
    }
}
