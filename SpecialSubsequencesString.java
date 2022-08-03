/*
	 * You have given a string A having Uppercase English letters.
	 * 
	 * You have to find how many times subsequence "AG" is there in the given
	 * string.
	 * 
	 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
	 */

public class Solution {
    public int solve(String A) {
        int count=0,ans=0;
        char[] ch = A.toCharArray();
        int m = 1000000007;
        for(int i=ch.length-1;i>=0;i--)
        {
            if(ch[i]=='G')
            {
                count++;
            }
            else if(ch[i]=='A')
            {
                ans = (ans+count)%m;
            }

        }
      
    return (ans % m);
       
    }
}
