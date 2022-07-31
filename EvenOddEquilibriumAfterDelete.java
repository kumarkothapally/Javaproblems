public class Solution {
    public int solve(int[] A) {
        int[] peven=new int[A.length];
        int[] podd = new int[A.length];
        int podsum=0;
        int pevsum=0;
        int alen = A.length;
        int count=0;
        peven[0]=A[0];
        for(int i=1;i<alen;i++)
        {
            if(i%2==0)
            {
                peven[i]=peven[i-1]+A[i];
            }
            else if(i%2!=0)
            {
            peven[i]=peven[i-1];
            }
        }
        podd[0]=0;
        for(int k=1;k<alen;k++)
        {
            if(k%2!=0)
            {
                podd[k]=podd[k-1]+A[k];
            }
            else if(k%2==0)
            {
            podd[k]=podd[k-1];
            }
        }
        for(int j=0;j<alen;j++)
        {
             pevsum=0;
             podsum=0;
            if(j==0)
            {
            pevsum=podd[alen-1]-podd[0];
            }
            else
            {
          pevsum=peven[j-1]+podd[alen-1]-podd[j];
            }
          if(j==0)
          {
          podsum=peven[alen-1]-peven[0];
          }
          else
          {
           podsum=podd[j-1]+peven[alen-1]-peven[j];
          }

          if(pevsum==podsum)
          {
          count++;
          }

        }
       
        return count;
    }
}
