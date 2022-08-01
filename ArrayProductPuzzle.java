package examples;

public class Solution {
	/*
	 * Given an array of integers A, find and return the product array of the same
	 * size where the ith element of the product array will be equal to the product
	 * of all the elements divided by the ith element of the array.
	 * 
	 * Note: It is always possible to form the product array with integer (32 bit)
	 * values. Solve it without using the division operator.
	 */    public static void solve(int[] A) {
int[] suffix= new int[A.length];
int[] prefix= new int[A.length];
int[] product = new int[A.length];

prefix[0]=1;
for(int i=1;i<A.length;i++)
{
	
prefix[i]=prefix[i-1]*A[i-1];

    }

for(int i=0;i<prefix.length;i++)
{
	System.out.println("prefix");
	System.out.println(prefix[i]);
}



suffix[A.length-1]=1;
for(int i=A.length-2;i>=0;i--)
{
suffix[i]=suffix[i+1]*A[i+1];
}
for(int i=0;i<suffix.length;i++)
{
	System.out.println("sufffix");
	System.out.println(suffix[i]);
}

for(int i=0;i<=A.length-1;i++)
{
product[i]=prefix[i]*suffix[i];
}
for(int i=0;i<product.length;i++)
{
	System.out.println("product");
	System.out.println(product[i]);
}
}
    public static void main(String[] args)
    {
    	Solution s = new Solution();
    	int[] a= {1,2,3,4,5};
    	s.solve(a);
    }
}

