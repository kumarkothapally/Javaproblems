import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
arr[i]= sc.nextInt();
        }
   maxMin(arr);
        
    }
   public static void maxMin(int[] arr)
    {
        int k = arr.length;
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int j=0;j<k; j++)
        {
           if(max<arr[j])
           {
               max=arr[j];
           }
           if(min>arr[j])
           {
               min=arr[j];
           }
        }
        System.out.print(max+" "+min);
    }
}
