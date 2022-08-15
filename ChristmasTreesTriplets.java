Problem Description
You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
The cost of these trees is Bp + Bq + Br.
You are to choose 3 trees such that their total cost is minimum. Return that cost.

If it is not possible to choose 3 such trees return -1.
Problem Constraints
1 <= A[i], B[i] <= 109
3 <= size(A) = size(B) <= 3000

public class Solution {
    public long solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> li =null;
         long minsum=Integer.MAX_VALUE;
         long mini=Integer.MAX_VALUE;
         long sum=0;
        for(int j=1;j<A.size();j++)
        {
            li=new ArrayList();
            for(int i=j-1;i>=0;i--)
            {
                if(A.get(i)<A.get(j))
                {
                    int bi=B.get(i);
                    if(mini>bi)
                    {
                        mini=bi;
                    }
                }
            }
            for(int k=j+1;k<A.size();k++)
            {
                if(A.get(k)>A.get(j))
                {
 
               sum=B.get(j)+mini+B.get(k);
               if(sum<minsum)
               {
                   minsum=sum;
               }

            

                }
            }

           mini=Integer.MAX_VALUE;
        }
        if(minsum==Integer.MAX_VALUE)
        return -1;
        else
        return minsum;
    }
}
