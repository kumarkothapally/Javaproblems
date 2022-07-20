package examples;

public class GCD {
	
	public static void main(String[] args)
	{
		
		int a =gcd(42,36);
		System.out.println(42%36);
		System.out.println(36%42);
		System.out.println(a);
	}

	public static int  gcd(int divident, int devisor)
	{
		int rem = divident% devisor;
		while(rem!=0)
		{
		 divident =devisor;
		 devisor =rem;
		rem=divident%devisor;
		}
		return devisor; 
	}
}
