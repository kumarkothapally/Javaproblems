import java.lang.*;
import java.util.*;

public class Main {
   public static LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        
        int[] array = new int[s];  
        for(int i=0; i<s; i++)  
{     
array[i]=sc.nextInt();  
}  
isPerfect(array);
for(Map.Entry<Integer,String> e : map.entrySet())
{
 System.out.println(e.getValue());
}
        
    }

    public static void isPerfect(int[] n)
    {
       
        for(int j=0;j<n.length; j++)
        {
findPerfectNumber(n[j]);
        }
       

       
    }

    public static void findPerfectNumber(int n)
    {
        int sum =0;
        
         for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
sum =sum+i;

            }
        }
       if(sum==n)
        {
            map.put(n,"YES");
        }
        else{
            map.put(n,"NO");
        } 
        
    
    }
}
