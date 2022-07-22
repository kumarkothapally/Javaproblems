import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        maxMin(array);
        
    }
    public static void maxMin(int[] a)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
            {
                if(a[i+1]>max)
                {
                max=a[i+1];
                }
            }
            else{
                if(a[i]>max)
                max=a[i];
            }
            if(a[i]>a[i+1])
            {
                if(a[i+1]<min)
                {
                min=a[i+1];
                }
            }
            else
            {
                if(a[i]<min)
                min=a[i];
            }
            
           
        }
        System.out.println(max+" "+min);

    }
    
}
