You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U)
  public class Solution {
    public long solve(String A) {
        int n=A.length();
        long count=0;
        for(int i=0; i<n;i++)
        {
 if(A.charAt(i) == 'a'||A.charAt(i) == 'A'|| A.charAt(i) == 'e'||A.charAt(i) == 'E'|| 
          A.charAt(i) == 'i'||A.charAt(i) == 'I' || A.charAt(i) == 'o'||A.charAt(i) == 'O' || 
          A.charAt(i) == 'u'||A.charAt(i) == 'U')
 {
     count=count+n-i;
 }
        }
        return count%10003;
    }
    
}
