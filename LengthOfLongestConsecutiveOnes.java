 Length of longest consecutive ones
 
 Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
   Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
 
 public class Solution {
    public int solve(String A) {
        int count=0,left=0,right=0,l=0;
        int n=A.length();
        int max=Integer.MIN_VALUE;
        char one='1',zero='0';


        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)==one)
            {
                count++;
            }
        }
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)==zero)
            {
                left=0;
                for(int j=i-1;j>=0;j--)
                {
                   if(A.charAt(j)==one)
                   {
                   left++;
                   }
                   else
                   {
                   break;
                   }
                }
                right=0;
                for(int j=i+1;j<n;j++)
                {
                    if(A.charAt(j)==one)
                    {
                    right++;
                    }
                    else
                    {
                    break;
                    }
                }
                 l=0;
            l=left+right;
            
            if(l<count)
            {
                    l=left+right+1;
            }
            else
            {
        l=left+right;
            }
            
            if(max<l)
            {
                max=l;
            }

            }
           
            
        }
        if(count==0)
        {
            return 0;
        }
        if(max==Integer.MIN_VALUE)
        {
            return n;
        }
        
       return max;
    }
}

